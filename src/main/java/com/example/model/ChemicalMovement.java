package com.example.model;

import java.time.LocalDateTime;

public class ChemicalMovement {
    private String chemicalName;
    private String origin;
    private LocalDateTime timestamp;

    public ChemicalMovement(String chemicalName, String origin, LocalDateTime timestamp) {
        this.chemicalName = chemicalName;
        this.origin = origin;
        this.timestamp = timestamp;
    }

    // Add the logMovement method
    public void logMovement() {
        System.out.println("Chemical Movement logged:");
        System.out.println("Chemical: " + chemicalName);
        System.out.println("From: " + origin);
        System.out.println("Timestamp: " + timestamp);
    }

    public String getChemicalName() {
        return chemicalName;
    }

    public void setChemicalName(String chemicalName) {
        this.chemicalName = chemicalName;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
