package ru.samkad.carsalesproject.repository.impl;

import ru.samkad.carsalesproject.entity.Image;

import java.util.Optional;

public interface ImageRepositoryImpl {

    Image getDefaultImage();

    Optional<Image> findById(int id);

    void delete(Image image);
}
