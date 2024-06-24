package ru.samkad.carsalesproject.service.impl;

import ru.samkad.carsalesproject.entity.Transmission;

import java.util.Collection;

public interface TransmissionServiceImpl {
    Collection<Transmission> findAll();
}
