package com.example.controller;

import com.example.service.ShipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shipments")
public class ShipmentController {

    /*
    USER STORY:
    AS A GATE STAFF MEMBER,
    I WANT TO REGISTER A LORRY'S TICKET AND MARK THE SHIPMENT AS ACCEPTED OR REJECTED,
    SO THAT I KNOW WHETHER TO PROCEED WITH STORING THE SHIPMENT OR NOT

    ACCEPTANCE CRITERIA:
    * THE SYSTEM SHOULD ACCEPT A TICKET NUMBER AND MARK THE SHIPMENT AS ACCEPTED OR REJECTED BASED ON BASIC CAPACITY
    *NO NEED FOR DETAILED STORAGE INSTRUCTIONS OR COMPLEX CAPACITY CHECKS
     */

    private final ShipmentService shipmentService;

    public ShipmentController(ShipmentService shipmentService) {
        this.shipmentService = shipmentService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerShipment(@RequestParam String ticketNumber) {
        boolean isAccepted = shipmentService.isShipmentAccepted(ticketNumber);

        if(isAccepted){
            //ShipmentService.acceptShipment(ticketNumber);
            return ResponseEntity.ok("Shipment registered with ticket number: " + ticketNumber);
        } else {
            //shipmentService.rejectShipment(ticketNumber);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Shipment rejected for ticket: " + ticketNumber);
        }
    }
}
