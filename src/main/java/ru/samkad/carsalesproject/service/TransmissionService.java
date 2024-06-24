package ru.samkad.carsalesproject.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.samkad.carsalesproject.entity.Transmission;
import ru.samkad.carsalesproject.repository.impl.TransmissionRepositoryImpl;
import ru.samkad.carsalesproject.service.impl.TransmissionServiceImpl;

import java.util.Collection;

@Service
@AllArgsConstructor
public class TransmissionService implements TransmissionServiceImpl {

    private final TransmissionRepositoryImpl transmissionRepository;

    @Override
    public Collection<Transmission> findAll() {
        return transmissionRepository.findAll();
    }
}
