package com.example.service;

import com.example.model.ShipmentTicket;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShipmentService {


    public boolean isShipmentAccepted(String ticketNumber) {
        return ticketNumber.endsWith("A");
    }
}
