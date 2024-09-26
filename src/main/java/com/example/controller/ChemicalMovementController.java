package com.example.controller;

import com.example.service.ChemicalMovementService;
import com.example.model.ChemicalMovement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost")
@RestController
@RequestMapping("/chemicalMovements")
public class ChemicalMovementController {

    /*
    USER STORY:
    AS A SITE AUDITOR,
    I WANT TO LOG AND VIEW MOVEMENTS OF CHEMICALS,
    SO THAT I CAN TRACK BASIC INFORMATION ABOUT WHERE THE CHEMICALS ARE STORED OR MOVED

    ACCEPTANCE CRITERIA:
    * THE SYSTEM SHOULD ALLOW LOGGING A SIMPLE MOVEMENT ENTRY WITH CHEMICAL NAME, ORIGIN AND DESTINATION
    * THE SYSTEM SHOULD DISPLAY A LIST OF MOVEMENTS WITH THE BASIC DETAILS
     */

    private final ChemicalMovementService chemicalMovementService;

    public ChemicalMovementController(ChemicalMovementService chemicalMovementService) {
        this.chemicalMovementService = chemicalMovementService;
    }

    @GetMapping("/movement/log")
    public List<ChemicalMovement> getAllMovements() {
        return chemicalMovementService.getAllMovements();
    }

    @PostMapping("/movement/log")
    public ChemicalMovement logChemicalMovement(@RequestParam("chemical_name") String chemicalName,
                                                @RequestParam("origin") String origin,
                                                @RequestParam("destination") String destination) {
        return chemicalMovementService.logMovement(chemicalName, origin, destination);
    }
}
