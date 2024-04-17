package com.example.stationski.services.service;

import com.example.stationski.entities.Participant;
import com.example.stationski.repository.IParticipantRepository;
import com.example.stationski.services.interfaces.IParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParticipantService implements IParticipantService {

    @Autowired
    IParticipantRepository iParticipantRepository;


    @Override
    public Participant ajouterParticipant(Participant p) {
        return iParticipantRepository.save(p);
    }
}
