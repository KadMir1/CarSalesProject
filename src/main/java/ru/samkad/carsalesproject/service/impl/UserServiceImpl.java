package ru.samkad.carsalesproject.service.impl;

import ru.samkad.carsalesproject.entity.User;

import java.util.Optional;

public interface UserServiceImpl {
    Optional<User> save(User user);

    boolean update(User user);

    Optional<User> findByEmailAndPassword(String email, String password);

    void deleteByEmailAndPassword(String email, String password);
}
