package com.example.stationski.controller;

import com.example.stationski.entities.Logistique;
import com.example.stationski.services.interfaces.ILogistiqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/logistique")
public class LogistiqueController {

    @Autowired
    ILogistiqueService iLogistiqueService;

    @PostMapping("/addlogistique")
    public void addLogistique(@RequestParam String descriptionEvnmt, @RequestBody Logistique l) {
        iLogistiqueService.ajoutAffectLogEvnm(l, descriptionEvnmt);
    }
}
