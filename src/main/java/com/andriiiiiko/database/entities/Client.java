package com.andriiiiiko.database.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "clients")
@Data
public class Client {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name", nullable = false, length = 201)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 201)
    private String lastName;
}
