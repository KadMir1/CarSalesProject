package ru.samkad.carsalesproject.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.samkad.carsalesproject.entity.Color;
import ru.samkad.carsalesproject.repository.impl.ColorRepositoryImpl;
import ru.samkad.carsalesproject.service.impl.ColorServiceImpl;

import java.util.Collection;

@Service
@AllArgsConstructor
public class ColorService implements ColorServiceImpl {

    private final ColorRepositoryImpl colorRepository;

    @Override
    public Collection<Color> findAll() {
        return colorRepository.findAll();
    }
}
