package ru.samkad.carsalesproject.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.samkad.carsalesproject.entity.User;
import ru.samkad.carsalesproject.repository.impl.UserRepositoryImpl;
import ru.samkad.carsalesproject.service.impl.UserServiceImpl;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService implements UserServiceImpl {

    private final UserRepositoryImpl userRepository;

    @Override
    public Optional<User> save(User user) {
        return userRepository.save(user);
    }

    @Override
    public boolean update(User user) {
        return userRepository.update(user);
    }

    @Override
    public Optional<User> findByEmailAndPassword(String email, String password) {
        return userRepository.findByEmailAndPassword(email, password);
    }

    @Override
    public void deleteByEmailAndPassword(String email, String password) {
        userRepository.deleteByEmailAndPassword(email, password);
    }
}
