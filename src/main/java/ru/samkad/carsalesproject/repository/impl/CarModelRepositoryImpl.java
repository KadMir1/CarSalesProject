package ru.samkad.carsalesproject.repository.impl;

import ru.samkad.carsalesproject.entity.CarModel;

import java.util.Collection;

public interface CarModelRepositoryImpl {
    Collection<CarModel> findAll();

    CarModel getById(int id);
}
