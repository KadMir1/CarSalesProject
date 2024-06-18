package ru.samkad.carsalesproject.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.samkad.carsalesproject.entity.Body;
import ru.samkad.carsalesproject.repository.impl.BodyRepositoryImpl;

import java.util.Collection;

@Repository
@AllArgsConstructor
public class BodyRepository implements BodyRepositoryImpl {

    private final CrudRepository crudRepository;


    @Override
    public Collection<Body> findAll() {
        return crudRepository.query("FROM Body", Body.class);
    }
}
