package ru.samkad.carsalesproject.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.samkad.carsalesproject.entity.CarModel;
import ru.samkad.carsalesproject.repository.impl.CarModelRepositoryImpl;

import java.util.Collection;
import java.util.Map;

@Repository
@AllArgsConstructor
public class CarModelRepository implements CarModelRepositoryImpl {

    private final CrudRepository crudRepository;

    @Override
    public Collection<CarModel> findAll() {
        return crudRepository.query("FROM CarModel", CarModel.class);
    }

    @Override
    public CarModel getById(int id) {
        return crudRepository.one("FROM CarModel WHERE id = :cId", CarModel.class,
                Map.of("cId", id));
    }
}
