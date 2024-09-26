package com.example.service;

import com.example.model.ChemicalMovement;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ChemicalMovementService {
    private List<ChemicalMovement> movements = new ArrayList<>();

    public ChemicalMovement logMovement(String chemicalName, String origin, String destination) {
        ChemicalMovement movement = new ChemicalMovement(chemicalName, origin, destination, LocalDateTime.now());
        movements.add(movement);
        return movement; // Return the logged movement
    }

    public List<ChemicalMovement> getAllMovements() {
        return movements;
    }
}
