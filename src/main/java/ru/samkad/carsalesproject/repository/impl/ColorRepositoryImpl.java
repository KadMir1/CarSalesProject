package ru.samkad.carsalesproject.repository.impl;

import ru.samkad.carsalesproject.entity.Color;

import java.util.Collection;

public interface ColorRepositoryImpl {
    Collection<Color> findAll();
}
