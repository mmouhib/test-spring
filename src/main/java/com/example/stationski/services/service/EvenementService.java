package com.example.stationski.services.service;

import com.example.stationski.entities.Evenement;
import com.example.stationski.entities.Participant;
import com.example.stationski.repository.IEvenementRepository;
import com.example.stationski.repository.IParticipantRepository;
import com.example.stationski.services.interfaces.IEvenementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvenementService implements IEvenementService {

    @Autowired
    IEvenementRepository iEvenementRepository;
    @Autowired
    IParticipantRepository iParticipantRepository;

    @Override
    public Evenement ajoutAffectEvenParticip(Evenement e) {
        Participant participant = iParticipantRepository.findByNomAndPrenom(e.getParticipants()
                .get(0).getNom(), e.getParticipants().get(0).getPrenom()).get(0);

        List<Participant> participants = e.getParticipants();
        participants.add(participant);
        e.setParticipants(participants);
        return iEvenementRepository.save(e);
    }
}
