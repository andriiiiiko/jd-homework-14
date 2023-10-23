package com.andriiiiiko.database.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "planets")
@Data
public class Planet {

    @Id
    @GeneratedValue
    @Column(name = "id", length = 255)
    private String id;

    @Column(name = "name", nullable = false, length = 501)
    private String name;
}
