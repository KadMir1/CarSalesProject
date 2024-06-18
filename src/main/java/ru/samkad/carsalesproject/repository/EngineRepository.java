package ru.samkad.carsalesproject.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.samkad.carsalesproject.entity.Engine;
import ru.samkad.carsalesproject.entity.EngineSize;
import ru.samkad.carsalesproject.entity.FuelType;
import ru.samkad.carsalesproject.repository.impl.EngineRepositoryImpl;

import java.util.Map;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class EngineRepository implements EngineRepositoryImpl {

    private final CrudRepository crudRepository;

    @Override
    public Engine save(Engine engine) {
        crudRepository.run(session -> session.persist(engine));
        return engine;
    }

    @Override
    public Optional<Engine> findByFuelTypeAndSize(FuelType fuelType, EngineSize engineSize) {
        return crudRepository.optional(
                "FROM Engine AS e WHERE e.fuelType = :ft AND e.engineSize = :es",
                Engine.class,
                Map.of("ft", fuelType, "es", engineSize)
        );
    }
}
