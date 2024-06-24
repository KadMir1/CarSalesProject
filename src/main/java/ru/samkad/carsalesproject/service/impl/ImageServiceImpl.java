package ru.samkad.carsalesproject.service.impl;

import ru.samkad.carsalesproject.dto.ImageDto;
import ru.samkad.carsalesproject.entity.Image;

import java.util.Optional;

public interface ImageServiceImpl {

    ImageDto getDefaultImageDto();

    ImageDto getImageDtoById(int id);

    Optional<Image> getImageById(int id);

    Image saveImage(ImageDto imageDto);

    void deleteImage(Image image);
}
