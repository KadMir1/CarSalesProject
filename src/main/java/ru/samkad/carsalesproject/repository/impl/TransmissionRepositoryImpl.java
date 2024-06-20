package ru.samkad.carsalesproject.repository.impl;

import ru.samkad.carsalesproject.entity.Transmission;

import java.util.Collection;

public interface TransmissionRepositoryImpl {

    Collection<Transmission> findAll();
}
