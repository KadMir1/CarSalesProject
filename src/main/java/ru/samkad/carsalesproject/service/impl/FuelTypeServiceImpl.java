package ru.samkad.carsalesproject.service.impl;

import ru.samkad.carsalesproject.entity.FuelType;

import java.util.Collection;

public interface FuelTypeServiceImpl {
    Collection<FuelType> findAll();
}
