package com.example.controller;

import com.example.service.ChemicalMovementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost")
@RestController
@RequestMapping("/chemicalMovements")
// @Controller
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
    public String showMovementForm(Model model) {
        model.addAttribute("movements", chemicalMovementService.getAllMovements());
        return "chemical_movements";
    }

    @PostMapping("/movement/log")
    public String logChemicalMovement(@RequestParam("chemical_name") String chemicalName,
                                      @RequestParam("origin") String origin,
                                      @RequestParam("destination") String destination, Model model) {
        chemicalMovementService.logMovement(chemicalName, origin, destination);
        model.addAttribute("movements", chemicalMovementService.getAllMovements());
        return "chemical_movements";
    }
}
