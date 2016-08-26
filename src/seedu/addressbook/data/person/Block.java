package seedu.addressbook.data.person;

/**
 * Represents a person's block in their address.
 * 
 * @author Clarence
 */
public class Block {
    private final int _block;
    
    public Block(int block) {
        super();
        _block = block;
    }
    
    /**
     * @return the _block
     */
    public int getBlock() {
        return _block;
    }
    
}
