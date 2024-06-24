package ru.samkad.carsalesproject.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.samkad.carsalesproject.entity.Body;
import ru.samkad.carsalesproject.repository.impl.BodyRepositoryImpl;
import ru.samkad.carsalesproject.service.impl.BodyServiceImpl;

import java.util.Collection;

@Service
@AllArgsConstructor
public class BodyService implements BodyServiceImpl {
    private final BodyRepositoryImpl bodyRepository;

    @Override
    public Collection<Body> findAll() {
        return bodyRepository.findAll();
    }
}
