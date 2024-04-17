package com.example.stationski.services.service;

import com.example.stationski.entities.Logistique;
import com.example.stationski.repository.IEvenementRepository;
import com.example.stationski.repository.ILogistiqueRepository;
import com.example.stationski.services.interfaces.ILogistiqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogistiqueService implements ILogistiqueService {
    @Autowired
    ILogistiqueRepository iLogistiqueRepository;
    @Autowired
    IEvenementRepository iEvenementRepository;

    @Override
    public Logistique ajoutAffectLogEvnm(Logistique l, String descriptionEvnmt) {
        l.setEvenement(iEvenementRepository.findByDescription(descriptionEvnmt));
        return iLogistiqueRepository.save(l);
    }
}
