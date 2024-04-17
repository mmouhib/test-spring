package com.example.stationski.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Evenement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String description;
    private Date dateDebut;
    private Date dateFin;
    private float cout;
    @OneToMany(mappedBy = "evenement")
    @JsonIgnore
    private List<Logistique> logistiques;
    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    private List<Participant> participants;

}
