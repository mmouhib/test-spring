package com.example.stationski.repository;

import com.example.stationski.entities.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEvenementRepository extends JpaRepository<Evenement, Integer> {
    Evenement findByDescription(String description);
}
