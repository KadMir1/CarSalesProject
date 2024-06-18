package ru.samkad.carsalesproject.repository.impl;

import ru.samkad.carsalesproject.entity.Category;

import java.util.Collection;

public interface CategoryRepositoryImpl {
    Collection<Category> findALl();
}
