package ru.samkad.carsalesproject.entity;

import java.time.LocalDateTime;

public class PriceHistory {
    private int id;
    private long price;
    private LocalDateTime date = LocalDateTime.now();
}
