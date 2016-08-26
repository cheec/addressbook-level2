package seedu.addressbook.data.person;

/**
 * Represents a person's street in their address.
 * 
 * @author Clarence
 */
public class Street {
    private final String street;
    
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
    
}
