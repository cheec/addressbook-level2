package seedu.addressbook.data.person;

/**
 * Represents a person's street in their address.
 * 
 * @author Clarence
 */
public class Street {
    private final String street;
    
    private static final String STREET_VALIDATION_REGEX = ".+"; // any string
    
    public Street(String street) {
        super();
        this.street = street;
    }
    
    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }
    
    public static boolean isValidStreet(String testStreet) {
        return testStreet.trim().matches(STREET_VALIDATION_REGEX);
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((street == null) ? 0 : street.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Street other = (Street) obj;
        if (street == null) {
            if (other.street != null)
                return false;
        } else if (!street.equals(other.street))
            return false;
        return true;
    }
    
    @Override
    public String toString() {
        return street;
    }
    
}
