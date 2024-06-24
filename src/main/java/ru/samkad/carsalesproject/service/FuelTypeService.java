package ru.samkad.carsalesproject.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.samkad.carsalesproject.entity.FuelType;
import ru.samkad.carsalesproject.repository.impl.FuelTypeRepositoryImpl;
import ru.samkad.carsalesproject.service.impl.FuelTypeServiceImpl;

import java.util.Collection;
import java.util.List;

@Service
@AllArgsConstructor
public class FuelTypeService implements FuelTypeServiceImpl {

    private final FuelTypeRepositoryImpl fuelTypeRepository;

    @Override
    public Collection<FuelType> findAll() {
        return fuelTypeRepository.findAll();
    }
}
