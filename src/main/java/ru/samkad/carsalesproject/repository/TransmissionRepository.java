package ru.samkad.carsalesproject.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.samkad.carsalesproject.entity.Transmission;
import ru.samkad.carsalesproject.repository.impl.TransmissionRepositoryImpl;

import java.util.Collection;

@Repository
@AllArgsConstructor
public class TransmissionRepository implements TransmissionRepositoryImpl {

    private final CrudRepository crudRepository;

    @Override
    public Collection<Transmission> findAll() {
        return crudRepository.query("FROM Transmission", Transmission.class);
    }
}
