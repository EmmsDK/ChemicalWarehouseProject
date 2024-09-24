package com.example.service;

import com.example.model.ShipmentTicket;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShipmentService {
    private List<ShipmentTicket> shipmentTickets = new ArrayList<>();

    public void processShipment(int ticketNumber, String status) {
        ShipmentTicket ticket = new ShipmentTicket(ticketNumber, status);
        shipmentTickets.add(ticket);
    }

    public List<ShipmentTicket> getAllShipments() {
        return shipmentTickets;
    }
}
