package ru.samkad.carsalesproject.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.samkad.carsalesproject.entity.Brand;
import ru.samkad.carsalesproject.repository.impl.BrandRepositoryImpl;

import java.util.Collection;
import java.util.Map;

@Repository
@AllArgsConstructor
public class BrandRepository implements BrandRepositoryImpl {

    private final CrudRepository crudRepository;


    @Override
    public Collection<Brand> findAll() {
        return crudRepository.query("FROM Brand", Brand.class);
    }

    @Override
    public Brand getById(int id) {
        return crudRepository.one("FROM Brand WHERE id = :bId", Brand.class,
                Map.of("bId", id));
    }
}
