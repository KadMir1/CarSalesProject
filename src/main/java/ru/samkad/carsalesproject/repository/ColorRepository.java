package ru.samkad.carsalesproject.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.samkad.carsalesproject.entity.Color;
import ru.samkad.carsalesproject.repository.impl.ColorRepositoryImpl;

import java.util.Collection;

@Repository
@AllArgsConstructor
public class ColorRepository implements ColorRepositoryImpl {

    private final CrudRepository crudRepository;

    @Override
    public Collection<Color> findAll() {
        return crudRepository.query("FROM Color", Color.class);
    }
}
