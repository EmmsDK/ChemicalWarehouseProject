package com.example.model;

import java.time.LocalDateTime;

public class ChemicalMovement {
    private String chemicalName;
    private String origin;
    private String destination;
    private LocalDateTime timestamp;

    public ChemicalMovement(String chemicalName, String origin, String destination, LocalDateTime timestamp) {
        this.chemicalName = chemicalName;
        this.origin = origin;
        this.destination = destination;
        this.timestamp = timestamp;
    }

    // Add the logMovement method
    public void logMovement() {
        System.out.println("Chemical Movement logged:");
        System.out.println("Chemical: " + chemicalName);
        System.out.println("From: " + origin + " to " + destination);
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

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
