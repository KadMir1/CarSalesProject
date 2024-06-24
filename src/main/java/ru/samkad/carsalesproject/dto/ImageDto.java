package ru.samkad.carsalesproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ImageDto {
    private String name;
    private byte[] content;
}
