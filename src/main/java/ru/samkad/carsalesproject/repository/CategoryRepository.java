package ru.samkad.carsalesproject.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.samkad.carsalesproject.entity.Category;
import ru.samkad.carsalesproject.repository.impl.CategoryRepositoryImpl;

import java.util.Collection;

@Repository
@AllArgsConstructor
public class CategoryRepository implements CategoryRepositoryImpl {

    private final CrudRepository crudRepository;

    @Override
    public Collection<Category> findALl() {
        return crudRepository.query("FROM Category", Category.class);
    }
}
