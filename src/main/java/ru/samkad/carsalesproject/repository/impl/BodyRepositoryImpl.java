package ru.samkad.carsalesproject.repository.impl;

import ru.samkad.carsalesproject.entity.Body;

import java.util.Collection;

public interface BodyRepositoryImpl {
    Collection<Body> findAll();
}
