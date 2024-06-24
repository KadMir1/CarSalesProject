package ru.samkad.carsalesproject.service.impl;

import ru.samkad.carsalesproject.entity.CarModel;

import java.util.Collection;

public interface CarModelServiceImpl {
    Collection<CarModel> findAll();

    CarModel getById(int id);
}
