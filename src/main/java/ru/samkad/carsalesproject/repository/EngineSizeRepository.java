package ru.samkad.carsalesproject.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.samkad.carsalesproject.entity.EngineSize;
import ru.samkad.carsalesproject.repository.impl.EngineSizeRepositoryImpl;

import java.util.Collection;

@Repository
@AllArgsConstructor
public class EngineSizeRepository implements EngineSizeRepositoryImpl {

    private final CrudRepository crudRepository;

    @Override
    public Collection<EngineSize> findAll() {
        return crudRepository.query("FROM EngineSize", EngineSize.class);
    }
}
