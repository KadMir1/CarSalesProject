package ru.samkad.carsalesproject.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.samkad.carsalesproject.entity.FuelType;
import ru.samkad.carsalesproject.repository.impl.FuelTypeRepositoryImpl;

import java.util.Collection;

@Repository
@AllArgsConstructor
public class FuelTypeRepository implements FuelTypeRepositoryImpl {

    private final CrudRepository crudRepository;

    @Override
    public Collection<FuelType> findAll() {
        return crudRepository.query("FROM FuelType", FuelType.class);
    }
}
