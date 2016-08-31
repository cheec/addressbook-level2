package seedu.addressbook.data.person;

/**
 * Represents a person's unit in their address.
 * 
 * @author Clarence
 */
public class Unit {
    private final String unit;
    
    public static final String UNIT_VALIDATION_REGEX = "(#)(\\d+)(-)(\\d+)";
    
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
    
    public static boolean isValidUnit(String testUnit) {
        return testUnit.trim().matches(UNIT_VALIDATION_REGEX);
    }
    
}
