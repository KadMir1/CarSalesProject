package ru.samkad.carsalesproject.repository.impl;

import ru.samkad.carsalesproject.entity.Car;
import ru.samkad.carsalesproject.entity.Post;
import ru.samkad.carsalesproject.entity.User;

import java.util.List;
import java.util.Optional;

public interface PostRepositoryImpl {

    Optional<Post> save(Post post);

    Optional<Post> findById(int id);

    List<Post> findAllNotSold();

    List<Post> findAllByUserId(int id);

    boolean update(Post post);

    void deleteAllByUser(User user);

    List<Post> findAllByCriteria(Car car, boolean imageExist, int createdDaysBefore,
                                 long minPrice, long maxPrice);
}
