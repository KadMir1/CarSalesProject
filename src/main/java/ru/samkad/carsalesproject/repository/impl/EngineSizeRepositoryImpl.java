package ru.samkad.carsalesproject.repository.impl;

import ru.samkad.carsalesproject.entity.EngineSize;

import java.util.Collection;

public interface EngineSizeRepositoryImpl {

    Collection<EngineSize> findAll();
}
