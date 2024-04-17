package com.example.stationski.controller;

import com.example.stationski.entities.Evenement;
import com.example.stationski.services.interfaces.IEvenementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/evenement")
public class EvenementController {

    @Autowired
    IEvenementService iEvenementService;

    @PostMapping("/addevenement")
    public void addEvenement(@RequestBody Evenement e) {
        iEvenementService.ajoutAffectEvenParticip(e);
    }
}
