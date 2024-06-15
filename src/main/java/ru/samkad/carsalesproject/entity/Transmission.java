package ru.samkad.carsalesproject.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "transmission")
@Data
public class Transmission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
}
