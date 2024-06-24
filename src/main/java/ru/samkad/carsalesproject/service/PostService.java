package ru.samkad.carsalesproject.service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.samkad.carsalesproject.dto.ImageDto;
import ru.samkad.carsalesproject.dto.PostSearchDto;
import ru.samkad.carsalesproject.entity.*;
import ru.samkad.carsalesproject.repository.impl.PostRepositoryImpl;
import ru.samkad.carsalesproject.service.impl.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PostService implements PostServiceImpl {

    private final PostRepositoryImpl postRepository;
    private final CarModelServiceImpl carModelService;
    private final CarServiceImpl carService;
    private final EngineServiceImpl engineService;
    private final ImageServiceImpl imageService;
    private final PriceHistoryServiceImpl priceHistoryService;


    @Override
    public Optional<Post> save(Post post, ImageDto imageDto) {
        setBrand(post.getCar());
        setEngine(post.getCar());
        addPriceHistory(post);
        Image newImage = imageDto.getContent().length != 0 ? imageService.saveImage(imageDto) : null;
        post.setImage(newImage);
        Optional<Post> postOptional = postRepository.save(post);
        if (postOptional.isEmpty() && newImage != null) {
            imageService.deleteImage(newImage);
        }
        return postOptional;
    }

    @Override
    public Optional<Post> findById(int id) {
        return postRepository.findById(id);
    }

    @Override
    public List<Post> findAllNotSold() {
        return postRepository.findAllNotSold();
    }

    @Override
    public List<Post> findAllByUserId(int id) {
        return postRepository.findAllByUserId(id);
    }

    @Override
    public boolean update(Post post, ImageDto imageDto) {
        setBrand(post.getCar());
        setBrand(post.getCar());
        post.setPriceHistories(priceHistoryService.getPriceHistoriesByPostId(post.getId()));
        PriceHistory lastPrice = Collections.max(post.getPriceHistories(),
                Comparator.comparing(PriceHistory::getDate));
        if (post.getPrice() != lastPrice.getPrice()) {
            addPriceHistory(post);
        }

        boolean isNewImageExists = imageDto.getContent().length != 0;
        Optional<Image> oldImage = post.getImage() != null
                ? imageService.getImageById(post.getImage().getId()) : Optional.empty();
        if (!isNewImageExists) {
            oldImage.ifPresent(post::setImage);
            return postRepository.update(post);
        }
        Image newImage = imageService.saveImage(imageDto);
        post.setImage(newImage);
        boolean isUpdated = postRepository.update(post);
        if (isUpdated) {
            oldImage.ifPresent(imageService::deleteImage);
        } else {
            imageService.deleteImage(newImage);
        }
        return isUpdated;
    }

    @Override
    public void deleteAllByUser(User user) {
        List<Post> posts = postRepository.findAllByUserId(user.getId());
        postRepository.deleteAllByUser(user);
        posts.forEach(this::deletePostsImage);
        posts.forEach(p -> carService.delete(p.getCar()));
    }

    @Override
    public List<Post> findAllByCriteria(PostSearchDto searchDto) {
        return postRepository.findAllByCriteria(
                searchDto.getCar(),
                searchDto.isImageExists(),
                searchDto.getPostCreatedBeforeDays(),
                searchDto.getLowestPrice(),
                searchDto.getHighestPrice());
    }

    private Car setBrand(Car car) {
        CarModel carModel = carModelService.getById(car.getCarModel().getId());
        Brand brand = new Brand();
        brand.setId(carModel.getBrandId());
        car.setBrand(brand);
        return car;
    }

    private Car setEngine(Car car) {
        Optional<Engine> engineOptional = engineService.findByFuelTypeAndSize(
                car.getEngine().getFuelType(), car.getEngine().getEngineSize());
        engineOptional.ifPresentOrElse(
                car::setEngine,
                () -> {
                    Engine engine = engineService.save(car.getEngine());
                    car.setEngine(engine);
                });
        return car;
    }

    private void deletePostsImage(Post post) {
        Optional<Image> postImage = post.getImage() != null
                ? imageService.getImageById(post.getImage().getId()) : Optional.empty();
        postImage.ifPresent(imageService::deleteImage);
    }

    private Post addPriceHistory(Post post) {
        PriceHistory newPriceHistory = new PriceHistory();
        newPriceHistory.setPrice(post.getPrice());
        post.getPriceHistories().add(newPriceHistory);
        return post;
    }
}
