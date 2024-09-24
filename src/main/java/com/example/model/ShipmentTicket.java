package com.example.model;

public class ShipmentTicket {
    private int ticketNumber;
    private String status;

    public ShipmentTicket(int ticketNumber, String status) {
        this.ticketNumber = ticketNumber;
        this.status = status;
    }
    public void mark_accepted() {
        this.status = "Accepted";
    }

    public void mark_rejected() {
        this.status = "Rejected";
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
