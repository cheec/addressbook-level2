package seedu.addressbook.data.person;

/**
 * Represents a person's unit in their address.
 * 
 * @author Clarence
 */
public class Unit {
    private final String unit;
    
    public Unit(String unit) {
        super();
        this.unit = unit;
    }
    
    /**
     * @return the unit
     */
    public String getUnit() {
        return unit;
    }
    
}
