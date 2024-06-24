package ru.samkad.carsalesproject.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.samkad.carsalesproject.entity.CarModel;
import ru.samkad.carsalesproject.repository.impl.CarModelRepositoryImpl;
import ru.samkad.carsalesproject.service.impl.CarModelServiceImpl;

import java.util.Collection;

@Service
@AllArgsConstructor
public class CarModelService implements CarModelServiceImpl {

    private final CarModelRepositoryImpl carModelRepository;

    @Override
    public Collection<CarModel> findAll() {
        return carModelRepository.findAll();
    }

    @Override
    public CarModel getById(int id) {
        return carModelRepository.getById(id);
    }
}
