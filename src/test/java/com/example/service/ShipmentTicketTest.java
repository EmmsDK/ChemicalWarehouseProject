package com.example.service;

import com.example.model.ShipmentTicket;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShipmentTicketTest {

    @Test
    public void testMarkAccepted() {
        ShipmentTicket ticket = new ShipmentTicket(1, "Pending");
        ticket.mark_accepted();
        assertEquals("Accepted", ticket.getStatus());
    }

    @Test
    public void testMarkRejected() {
        ShipmentTicket ticket = new ShipmentTicket(1, "Pending");
        ticket.mark_rejected();
        assertEquals("Rejected", ticket.getStatus());
    }

    @Test
    public void testGetTicketNumber() {
        ShipmentTicket ticket = new ShipmentTicket(1, "Pending");
        assertEquals(1, ticket.getTicketNumber());
    }

    @Test
    public void testSetTicketNumber() {
        ShipmentTicket ticket = new ShipmentTicket(1, "Pending");
        ticket.setTicketNumber(2);
        assertEquals(2, ticket.getTicketNumber());
    }

    @Test
    public void testGetStatus() {
        ShipmentTicket ticket = new ShipmentTicket(1, "Pending");
        assertEquals("Pending", ticket.getStatus());
    }

    @Test
    public void testSetStatus() {
        ShipmentTicket ticket = new ShipmentTicket(1, "Pending");
        ticket.setStatus("In Progress");
        assertEquals("In Progress", ticket.getStatus());
    }
}
