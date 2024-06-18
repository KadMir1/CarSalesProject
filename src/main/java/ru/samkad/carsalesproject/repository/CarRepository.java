package ru.samkad.carsalesproject.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.samkad.carsalesproject.entity.Car;
import ru.samkad.carsalesproject.repository.impl.CarRepositoryImpl;

@Repository
@AllArgsConstructor
public class CarRepository implements CarRepositoryImpl {

    private final CrudRepository crudRepository;

    @Override
    public void delete(Car car) {
        crudRepository.run(session -> session.detach(car));
    }
}
