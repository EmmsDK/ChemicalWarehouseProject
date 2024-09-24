package people;

import elements.ShipmentTicket;

public class GateStaff {

/*
people.GateStaff

Attributes:
name: The name of the gate staff member.
Methods:
accept_shipment(ticket_number): Registers a ticket and accepts/rejects the shipment based on predefined conditions (e.g., capacity).
*/

        private String name;

        public GateStaff(String name) {
            this.name = name;
        }

        public void accept_shipment(int ticket_number) {
            ShipmentTicket ticket = new ShipmentTicket(ticket_number, "Pending");
            if (ticket_number % 2 == 0) {
                ticket.mark_accepted();
            } else {
                ticket.mark_rejected();
            }
            System.out.println("Ticket Number: " + ticket.getTicketNumber());
            System.out.println("Status: " + ticket.getStatus());
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
}
