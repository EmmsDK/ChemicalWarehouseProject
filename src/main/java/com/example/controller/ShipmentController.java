package com.example.controller;

import com.example.service.ShipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ShipmentController {

    @Autowired
    private ShipmentService shipmentService;

    @GetMapping("/shipment/accept")
    public String showShipmentForm() {
        return "shipment_acceptance";
    }

    @PostMapping("/shipment/accept")
    public String processShipment(@RequestParam("ticket_number") int ticketNumber,
                                  @RequestParam("status") String status, Model model) {
        shipmentService.processShipment(ticketNumber, status);
        model.addAttribute("message", "Shipment " + status + " for ticket number: " + ticketNumber);
        return "shipment_acceptance";
    }
}
