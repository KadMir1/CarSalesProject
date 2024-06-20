package ru.samkad.carsalesproject.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.samkad.carsalesproject.entity.Image;
import ru.samkad.carsalesproject.repository.impl.ImageRepositoryImpl;

import java.util.Map;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class ImageRepository implements ImageRepositoryImpl {

    private final CrudRepository crudRepository;

    private final String DEFAULT_PHOTO_NAME = "defaultPhoto.png";

    @Override
    public Image getDefaultImage() {
        return crudRepository.one(
                "FROM Image WHERE name = :iName",
                Image.class,
                Map.of("iName", DEFAULT_PHOTO_NAME)
        );
    }

    @Override
    public Optional<Image> findById(int id) {
        return crudRepository.optional("FROM Image WHERE id = :iId",
                Image.class,
                Map.of("iId", id));
    }

    @Override
    public void delete(Image image) {
        crudRepository.run(session -> session.detach(image));
    }
}
