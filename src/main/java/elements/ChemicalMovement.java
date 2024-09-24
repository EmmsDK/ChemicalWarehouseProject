package elements;

public class ChemicalMovement {

/*
elements.ChemicalMovement

Attributes:
chemical_name: The name of the chemical being moved.
origin: Where the chemical is coming from.
destination: Where the chemical is going.
timestamp: The time of the movement.
Methods:
log_movement(): Logs the details of the chemical movement.
 */

    private String chemicalName;
    private String origin;
    private String destination;
    private String timestamp;

    public ChemicalMovement(String chemical_name, String origin, String destination, String timestamp) {
        this.chemicalName = chemical_name;
        this.origin = origin;
        this.destination = destination;
        this.timestamp = timestamp;
    }

    public void log_movement() {
        System.out.println("Chemical Name: " + this.chemicalName);
        System.out.println("Origin: " + this.origin);
        System.out.println("Destination: " + this.destination);
        System.out.println("Timestamp: " + this.timestamp);
    }

    public String getChemicalName() {
        return chemicalName;
    }

    public void setChemicalName(String chemicalName) {
        this.chemicalName = chemicalName;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

}
