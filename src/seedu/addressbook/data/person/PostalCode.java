package seedu.addressbook.data.person;

/**
 * Represents a person's postal code in their address.
 * 
 * @author Clarence
 *
 */
public class PostalCode {
    private final int postalCode;
    
    // any integer
    private static final String POSTALCODE_VALIDATION_REGEX = "\\d+";
    
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
    
    public static boolean isValidPostalCode(String testPostalCode) {
        return testPostalCode.trim().matches(POSTALCODE_VALIDATION_REGEX);
    }
    
}
