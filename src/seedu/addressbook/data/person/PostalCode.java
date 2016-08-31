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
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + postalCode;
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
        PostalCode other = (PostalCode) obj;
        if (postalCode != other.postalCode)
            return false;
        return true;
    }
    
    @Override
    public String toString() {
        return "" + this.postalCode;
    }
    
}
