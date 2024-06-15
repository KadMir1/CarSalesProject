package ru.samkad.carsalesproject.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "car_model")
@Data
public class CarModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(name = "brand_id")
    private int brandId;
}
