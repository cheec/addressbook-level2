package seedu.addressbook.data.person;

/**
 * Represents a person's postal code in their address.
 * 
 * @author Clarence
 *
 */
public class PostalCode {
    private final int postalCode;
    
    public PostalCode(int postalCode) {
        super();
        this.postalCode = postalCode;
    }
    
    /**
     * @return the postalCode
     */
    public int getPostalCode() {
        return postalCode;
    }
    
}
