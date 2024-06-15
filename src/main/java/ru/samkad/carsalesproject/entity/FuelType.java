package ru.samkad.carsalesproject.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "fuel_type")
@Data
public class FuelType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
}
