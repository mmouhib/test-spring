package com.example.stationski.repository;

import com.example.stationski.entities.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IParticipantRepository extends JpaRepository<Participant, Integer> {
    List<Participant> findByNomAndPrenom(String nom, String prenom);
}
