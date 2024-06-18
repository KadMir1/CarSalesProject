package ru.samkad.carsalesproject.repository.impl;

import ru.samkad.carsalesproject.entity.Brand;

import java.util.Collection;

public interface BrandRepositoryImpl {

    Collection<Brand> findAll();

    Brand getById(int id);
}
