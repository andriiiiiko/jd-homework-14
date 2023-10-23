package com.andriiiiiko.database.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.security.Timestamp;

@Entity
@Table(name = "tickets")
@Data
public class Ticket {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "created_at", nullable = false, updatable = false)
    private Timestamp createdAt;

    @ManyToOne
    @JoinColumn(name = "client_id", referencedColumnName = "id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "from_planet_id", referencedColumnName = "id")
    private Planet fromPlanet;

    @ManyToOne
    @JoinColumn(name = "to_planet_id", referencedColumnName = "id")
    private Planet toPlanet;
}
