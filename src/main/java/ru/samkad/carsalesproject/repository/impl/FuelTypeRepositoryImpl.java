package ru.samkad.carsalesproject.repository.impl;

import ru.samkad.carsalesproject.entity.FuelType;

import java.util.Collection;

public interface FuelTypeRepositoryImpl {
    Collection<FuelType> findAll();
}
