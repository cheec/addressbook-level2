package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book. Guarantees: immutable; is
 * valid as declared in {@link #isValidAddress(String)}
 */
public class Address {
    
    public static final String EXAMPLE                     = "123, Clementi Ave 3, #12-34, 231534";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS =
            "Person addresses must be in the format: BLOCK, STREET, UNIT, POSTAL_CODE";
    
    private final Block      _block;
    private final Street     _street;
    private final Unit       _unit;
    private final PostalCode _postalCode;
    
    private boolean isPrivate;
    
    private static final int DATA_ARGS_INDEX_BLOCK      = 0;
    private static final int DATA_ARGS_INDEX_UNIT       = 1;
    private static final int DATA_ARGS_INDEX_STREET     = 2;
    private static final int DATA_ARGS_INDEX_POSTALCODE = 3;
    
    /**
     * Validates given address.
     *
     * @throws IllegalValueException
     *             if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        if (!isValidAddress(address)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        
        // address string is valid, proceed with instantiating members
        final String[] splitAddressArgs = address.split(",");
        
        final String blockArgs = splitAddressArgs[DATA_ARGS_INDEX_BLOCK].trim();
        final String unitArgs = splitAddressArgs[DATA_ARGS_INDEX_UNIT].trim();
        final String streetArgs = splitAddressArgs[DATA_ARGS_INDEX_STREET].trim();
        final String postalCodeArgs = splitAddressArgs[DATA_ARGS_INDEX_POSTALCODE].trim();
        
        _block = new Block(Integer.parseInt(blockArgs));
        _street = new Street(streetArgs);
        _unit = new Unit(unitArgs);
        _postalCode = new PostalCode(Integer.parseInt(postalCodeArgs));
    }
    
    /**
     * Returns true if a given string is a valid person address.
     */
    public static boolean isValidAddress(String test) {
        if (!isAddressExtractable(test)) {
            return false;
        }
        
        // test string is extractable, proceed to extract
        final String[] splitAddressArgs = test.split(",");
        
        final String testBlock = splitAddressArgs[DATA_ARGS_INDEX_BLOCK].trim();
        final String testUnit = splitAddressArgs[DATA_ARGS_INDEX_UNIT].trim();
        final String testStreet = splitAddressArgs[DATA_ARGS_INDEX_STREET].trim();
        final String testPostalCode = splitAddressArgs[DATA_ARGS_INDEX_POSTALCODE].trim();
        
        // tests validity of each component of a person's address
        return Block.isValidBlock(testBlock) && Unit.isValidUnit(testUnit) && Street.isValidStreet(testStreet)
                && PostalCode.isValidPostalCode(testPostalCode);
    }
    
    /**
     * Returns true if a given string has extractable address information
     */
    private static boolean isAddressExtractable(String test) {
        final String[] splitArgs = test.trim().split(",", 4);
        return splitArgs.length == 4 // 4 arguments
                && !splitArgs[0].isEmpty() // non-empty arguments
                && !splitArgs[1].isEmpty() && !splitArgs[2].isEmpty() && !splitArgs[3].isEmpty();
    }
    
    @Override
    public String toString() {
        return _block + ", " + _street + ", " + _unit + ", " + _postalCode;
    }
    
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof Address) {
            Address o = (Address) other;
            return o._block.equals(this._block) && o._street.equals(this._street) && o._unit.equals(this._unit)
                    && o._postalCode.equals(this._postalCode);
        }
        
        return false;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_block == null) ? 0 : _block.hashCode());
        result = prime * result + ((_postalCode == null) ? 0 : _postalCode.hashCode());
        result = prime * result + ((_street == null) ? 0 : _street.hashCode());
        result = prime * result + ((_unit == null) ? 0 : _unit.hashCode());
        return result;
    }
    
    public boolean isPrivate() {
        return isPrivate;
    }
}