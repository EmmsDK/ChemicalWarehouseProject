package com.example.service;

import com.example.model.ChemicalMovement;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChemicalMovementTest {

    @Test
    public void testLogMovement() {
        LocalDateTime timestamp = LocalDateTime.parse("2023-10-01 10:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        ChemicalMovement movement = new ChemicalMovement("ChemicalX", "Lab", "Storage", timestamp);
        movement.logMovement();
        // Assuming the output is checked manually or redirected to a logger
    }

    @Test
    public void testGetChemicalName() {
        LocalDateTime timestamp = LocalDateTime.parse("2023-10-01 10:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        ChemicalMovement movement = new ChemicalMovement("ChemicalX", "Lab", "Storage", timestamp);
        assertEquals("ChemicalX", movement.getChemicalName());
    }

    @Test
    public void testSetChemicalName() {
        LocalDateTime timestamp = LocalDateTime.parse("2023-10-01 10:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        ChemicalMovement movement = new ChemicalMovement("ChemicalX", "Lab", "Storage", timestamp);
        movement.setChemicalName("ChemicalY");
        assertEquals("ChemicalY", movement.getChemicalName());
    }

    @Test
    public void testGetOrigin() {
        LocalDateTime timestamp = LocalDateTime.parse("2023-10-01 10:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        ChemicalMovement movement = new ChemicalMovement("ChemicalX", "Lab", "Storage", timestamp);
        assertEquals("Lab", movement.getOrigin());
    }

    @Test
    public void testSetOrigin() {
        LocalDateTime timestamp = LocalDateTime.parse("2023-10-01 10:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        ChemicalMovement movement = new ChemicalMovement("ChemicalX", "Lab", "Storage", timestamp);
        movement.setOrigin("Warehouse");
        assertEquals("Warehouse", movement.getOrigin());
    }

    @Test
    public void testGetDestination() {
        LocalDateTime timestamp = LocalDateTime.parse("2023-10-01 10:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        ChemicalMovement movement = new ChemicalMovement("ChemicalX", "Lab", "Storage", timestamp);
        assertEquals("Storage", movement.getDestination());
    }

    @Test
    public void testSetDestination() {
        LocalDateTime timestamp = LocalDateTime.parse("2023-10-01 10:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        ChemicalMovement movement = new ChemicalMovement("ChemicalX", "Lab", "Storage", timestamp);
        movement.setDestination("Lab");
        assertEquals("Lab", movement.getDestination());
    }

    @Test
    public void testGetTimestamp() {
        LocalDateTime timestamp = LocalDateTime.parse("2023-10-01 10:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        ChemicalMovement movement = new ChemicalMovement("ChemicalX", "Lab", "Storage", timestamp);
        assertEquals("2023-10-01 10:00:00", movement.getTimestamp().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }

    @Test
    public void testSetTimestamp() {
        LocalDateTime timestamp = LocalDateTime.parse("2023-10-01 10:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        ChemicalMovement movement = new ChemicalMovement("ChemicalX", "Lab", "Storage", timestamp);
        movement.setTimestamp(LocalDateTime.parse("2023-10-02 11:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        assertEquals("2023-10-02 11:00:00", movement.getTimestamp().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}