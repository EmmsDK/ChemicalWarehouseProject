package people;

import elements.ChemicalMovement;

public class SiteAuditor {

/*
people.SiteAuditor

Attributes:
name: The name of the site auditor.
Methods:
view_movements(): Displays the list of logged chemical movements.
log_movement(chemical_name, origin, destination): Allows the site auditor to log the movement of a chemical.
 */

    private String name;
    private final ChemicalMovement[] chemicalMovements = new ChemicalMovement[10];
    private int movementCount = 0;

    public SiteAuditor(String name) {
        this.name = name;
    }

    public void view_movements() {
        for (int i = 0; i < movementCount; i++) {
            chemicalMovements[i].log_movement();
        }
    }

    public void log_movement(String chemical_name, String origin, String destination, String timestamp) {
        ChemicalMovement movement = new ChemicalMovement(chemical_name, origin, destination, timestamp);
        chemicalMovements[movementCount] = movement;
        movementCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
