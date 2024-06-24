package ru.samkad.carsalesproject.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.samkad.carsalesproject.entity.Engine;
import ru.samkad.carsalesproject.entity.EngineSize;
import ru.samkad.carsalesproject.entity.FuelType;
import ru.samkad.carsalesproject.repository.impl.EngineRepositoryImpl;
import ru.samkad.carsalesproject.service.impl.EngineServiceImpl;

import java.util.Optional;

@Service
@AllArgsConstructor
public class EngineService implements EngineServiceImpl {

    private final EngineRepositoryImpl engineRepository;

    @Override
    public Engine save(Engine engine) {
        return engineRepository.save(engine);
    }

    @Override
    public Optional<Engine> findByFuelTypeAndSize(FuelType fuelType, EngineSize size) {
        return engineRepository.findByFuelTypeAndSize(fuelType, size);
    }
}
