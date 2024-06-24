package ru.samkad.carsalesproject.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.samkad.carsalesproject.dto.ImageDto;
import ru.samkad.carsalesproject.entity.Image;
import ru.samkad.carsalesproject.repository.impl.ImageRepositoryImpl;
import ru.samkad.carsalesproject.service.impl.ImageServiceImpl;
import ru.samkad.carsalesproject.utils.ImageUtil;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ImageService implements ImageServiceImpl {

    private final ImageRepositoryImpl imageRepository;
    private final ImageUtil imageUtil;

    @Override
    public ImageDto getDefaultImageDto() {
        return imageUtil.getImageDto(imageRepository.getDefaultImage());
    }

    @Override
    public ImageDto getImageDtoById(int id) {
        return imageUtil.getImageDto(imageRepository.findById(id).get());
    }

    @Override
    public Optional<Image> getImageById(int id) {
        return imageRepository.findById(id);
    }

    @Override
    public Image saveImage(ImageDto imageDto) {
        return imageUtil.saveImage(imageDto);
    }

    @Override
    public void deleteImage(Image image) {
        imageRepository.delete(image);
        imageUtil.deleteImage(image);
    }
}
