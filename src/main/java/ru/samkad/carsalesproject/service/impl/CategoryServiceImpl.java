package ru.samkad.carsalesproject.service.impl;

import ru.samkad.carsalesproject.entity.Category;

import java.util.Collection;

public interface CategoryServiceImpl {
    Collection<Category> findAll();
}
