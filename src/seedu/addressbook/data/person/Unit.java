package seedu.addressbook.data.person;

/**
 * Represents a person's unit in their address.
 * 
 * @author Clarence
 */
public class Unit {
    private final String unit;
    
    // valid unit numbers are in the form: #(any no. digits)-(any no. digits)
    private static final String UNIT_VALIDATION_REGEX = "(#)(\\d+)(-)(\\d+)";
    
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
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((unit == null) ? 0 : unit.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Unit other = (Unit) obj;
        if (unit == null && other.unit != null) {
                return false;
        }
        return this.unit.equals(other.unit);
    }
    
    @Override
    public String toString() {
        return this.unit;
    }
    
}
