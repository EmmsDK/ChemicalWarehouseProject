package people;

import elements.ShipmentTicket;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GateStaffTest {

    @Test
    public void testAcceptShipmentEvenTicket() {
        GateStaff staff = new GateStaff("John");
        staff.accept_shipment(2);
    }

    @Test
    public void testAcceptShipmentOddTicket() {
        GateStaff staff = new GateStaff("John");
        staff.accept_shipment(3);
    }

    @Test
    public void testGetName() {
        GateStaff staff = new GateStaff("John");
        assertEquals("John", staff.getName());
    }

    @Test
    public void testSetName() {
        GateStaff staff = new GateStaff("John");
        staff.setName("Doe");
        assertEquals("Doe", staff.getName());
    }
}
