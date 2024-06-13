package ru.samkad.carsalesproject.entity;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Post {
    private int id;
    private String description;
    private Car car;
    private Image image;
    private LocalDateTime created = LocalDateTime.now();
    private boolean sold;
    private long price;
    private Set<PriceHistory> priceHistories = new HashSet<>();
    private User user;
}
