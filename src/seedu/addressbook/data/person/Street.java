package seedu.addressbook.data.person;

/**
 * Represents a person's street in their address.
 * 
 * @author Clarence
 */
public class Street {
    private final String street;
    
    public static final String STREET_VALIDATION_REGEX = ".+"; // any string
    
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
    
}
