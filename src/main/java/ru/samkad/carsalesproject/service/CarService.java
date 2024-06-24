package ru.samkad.carsalesproject.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.samkad.carsalesproject.entity.Car;
import ru.samkad.carsalesproject.repository.impl.CarRepositoryImpl;
import ru.samkad.carsalesproject.service.impl.CarServiceImpl;

@Service
@AllArgsConstructor
public class CarService implements CarServiceImpl {

    private final CarRepositoryImpl carRepository;

    @Override
    public void delete(Car car) {
        carRepository.delete(car);
    }
}
