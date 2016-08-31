package seedu.addressbook.data.person;

/**
 * Represents a person's block in their address.
 * 
 * @author Clarence
 */
public class Block {
    private final int block;
    
    private static final String BLOCK_VALIDATION_REGEX = "\\d+"; // any integer
    
    public Block(int block) {
        super();
        this.block = block;
    }
    
    /**
     * @return the _block
     */
    public int getBlock() {
        return this.block;
    }
    
    public static boolean isValidBlock(String testBlock) {
        return testBlock.trim().matches(BLOCK_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return "" + this.block;
    }
}
