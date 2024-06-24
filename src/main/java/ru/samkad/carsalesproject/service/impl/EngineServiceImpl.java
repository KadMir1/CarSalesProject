package ru.samkad.carsalesproject.service.impl;

import ru.samkad.carsalesproject.entity.Engine;
import ru.samkad.carsalesproject.entity.EngineSize;
import ru.samkad.carsalesproject.entity.FuelType;

import java.util.Optional;

public interface EngineServiceImpl {
    Engine save(Engine engine);

    Optional<Engine> findByFuelTypeAndSize(FuelType fuelType, EngineSize size);
}
