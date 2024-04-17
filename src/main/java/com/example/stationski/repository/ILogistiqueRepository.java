package com.example.stationski.repository;

import com.example.stationski.entities.Evenement;
import com.example.stationski.entities.Logistique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILogistiqueRepository extends JpaRepository<Logistique, Integer> {

}
