package ru.samkad.carsalesproject.service.impl;

import ru.samkad.carsalesproject.entity.Brand;

import java.util.Collection;

public interface BrandServiceImpl {
    Collection<Brand> findAll();

    Brand getById(int id);
}
