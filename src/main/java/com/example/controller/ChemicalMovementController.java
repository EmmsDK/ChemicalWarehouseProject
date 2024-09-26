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
