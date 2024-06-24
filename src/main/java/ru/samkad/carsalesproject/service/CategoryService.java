package ru.samkad.carsalesproject.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.samkad.carsalesproject.entity.Category;
import ru.samkad.carsalesproject.repository.impl.CategoryRepositoryImpl;
import ru.samkad.carsalesproject.service.impl.CategoryServiceImpl;

import java.util.Collection;

@Service
@AllArgsConstructor
public class CategoryService implements CategoryServiceImpl {

    private final CategoryRepositoryImpl categoryRepository;

    @Override
    public Collection<Category> findAll() {
        return categoryRepository.findALl();
    }
}
