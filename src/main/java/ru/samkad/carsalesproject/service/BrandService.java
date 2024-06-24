package ru.samkad.carsalesproject.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.samkad.carsalesproject.entity.Brand;
import ru.samkad.carsalesproject.repository.impl.BrandRepositoryImpl;
import ru.samkad.carsalesproject.service.impl.BrandServiceImpl;

import java.util.Collection;

@Service
@AllArgsConstructor
public class BrandService implements BrandServiceImpl {

    private final BrandRepositoryImpl brandRepository;

    @Override
    public Collection<Brand> findAll() {
        return brandRepository.findAll();
    }

    @Override
    public Brand getById(int id) {
        return brandRepository.getById(id);
    }
}
