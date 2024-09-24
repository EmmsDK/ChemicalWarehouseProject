package elements;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ChemicalMovementTest {

    @Test
    public void testLogMovement() {
        ChemicalMovement movement = new ChemicalMovement("ChemicalX", "Lab", "Storage", "2023-10-01 10:00:00");
        movement.log_movement();
        // Assuming the output is checked manually or redirected to a logger
    }

    @Test
    public void testGetChemicalName() {
        ChemicalMovement movement = new ChemicalMovement("ChemicalX", "Lab", "Storage", "2023-10-01 10:00:00");
        assertEquals("ChemicalX", movement.getChemicalName());
    }

    @Test
    public void testSetChemicalName() {
        ChemicalMovement movement = new ChemicalMovement("ChemicalX", "Lab", "Storage", "2023-10-01 10:00:00");
        movement.setChemicalName("ChemicalY");
        assertEquals("ChemicalY", movement.getChemicalName());
    }

    @Test
    public void testGetOrigin() {
        ChemicalMovement movement = new ChemicalMovement("ChemicalX", "Lab", "Storage", "2023-10-01 10:00:00");
        assertEquals("Lab", movement.getOrigin());
    }

    @Test
    public void testSetOrigin() {
        ChemicalMovement movement = new ChemicalMovement("ChemicalX", "Lab", "Storage", "2023-10-01 10:00:00");
        movement.setOrigin("Warehouse");
        assertEquals("Warehouse", movement.getOrigin());
    }

    @Test
    public void testGetDestination() {
        ChemicalMovement movement = new ChemicalMovement("ChemicalX", "Lab", "Storage", "2023-10-01 10:00:00");
        assertEquals("Storage", movement.getDestination());
    }

    @Test
    public void testSetDestination() {
        ChemicalMovement movement = new ChemicalMovement("ChemicalX", "Lab", "Storage", "2023-10-01 10:00:00");
        movement.setDestination("Lab");
        assertEquals("Lab", movement.getDestination());
    }

    @Test
    public void testGetTimestamp() {
        ChemicalMovement movement = new ChemicalMovement("ChemicalX", "Lab", "Storage", "2023-10-01 10:00:00");
        assertEquals("2023-10-01 10:00:00", movement.getTimestamp());
    }

    @Test
    public void testSetTimestamp() {
        ChemicalMovement movement = new ChemicalMovement("ChemicalX", "Lab", "Storage", "2023-10-01 10:00:00");
        movement.setTimestamp("2023-10-02 11:00:00");
        assertEquals("2023-10-02 11:00:00", movement.getTimestamp());
    }
}
