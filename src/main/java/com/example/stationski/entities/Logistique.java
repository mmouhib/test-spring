package com.example.stationski.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Logistique {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLog;
    private String description;
    private boolean reserve;
    private float prixUnit;
    private int quantite;
    @ManyToOne
    private Evenement evenement;
}
