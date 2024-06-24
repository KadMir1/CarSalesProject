package ru.samkad.carsalesproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.samkad.carsalesproject.entity.Car;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostSearchDto {
    private Car car;
    private long highestPrice;
    private long lowestPrice;
    private int postCreatedBeforeDays;
    private boolean imageExists;
}
