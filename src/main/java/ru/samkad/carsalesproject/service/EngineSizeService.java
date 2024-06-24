package ru.samkad.carsalesproject.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.samkad.carsalesproject.entity.EngineSize;
import ru.samkad.carsalesproject.repository.impl.EngineSizeRepositoryImpl;
import ru.samkad.carsalesproject.service.impl.EngineSizeServiceImpl;

import java.util.Collection;

@Service
@AllArgsConstructor
public class EngineSizeService implements EngineSizeServiceImpl {

    private final EngineSizeRepositoryImpl engineSizeRepository;

    @Override
    public Collection<EngineSize> findAll() {
        return engineSizeRepository.findAll();
    }
}
