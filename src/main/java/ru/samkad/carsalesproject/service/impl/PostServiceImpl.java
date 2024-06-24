package ru.samkad.carsalesproject.service.impl;

import ru.samkad.carsalesproject.dto.ImageDto;
import ru.samkad.carsalesproject.dto.PostSearchDto;
import ru.samkad.carsalesproject.entity.Post;
import ru.samkad.carsalesproject.entity.User;

import java.util.List;
import java.util.Optional;

public interface PostServiceImpl {

    Optional<Post> save(Post post, ImageDto imageDto);

    Optional<Post> findById(int id);

    List<Post> findAllNotSold();

    List<Post> findAllByUserId(int id);

    boolean update(Post post, ImageDto imageDto);

    void deleteAllByUser(User user);

    List<Post> findAllByCriteria(PostSearchDto searchDto);

}
