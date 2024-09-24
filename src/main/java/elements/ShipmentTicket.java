package elements;

public class ShipmentTicket {

/*
User Story 1: Simple Shipment Acceptance
For shipment acceptance, you can create the following classes:

elements.ShipmentTicket

Attributes:
ticket_number: The unique identifier for each shipment.
status: Accepted or Rejected based on basic capacity checks.
Methods:
mark_accepted(): Marks the shipment as accepted.
mark_rejected(): Marks the shipment as rejected.
 */

    private int ticketNumber;
    private String status;

    public ShipmentTicket(int ticket_number, String status) {
        this.ticketNumber = ticket_number;
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
