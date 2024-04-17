package com.example.stationski.controller;

import com.example.stationski.entities.Participant;
import com.example.stationski.services.interfaces.IParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/participant")
public class ParticipantController {
    @Autowired
    IParticipantService iParticipantService;

    @PostMapping("/addparticipant")
    public Participant addParticipant(@RequestBody Participant p) {
        return iParticipantService.ajouterParticipant(p);
    }
}
