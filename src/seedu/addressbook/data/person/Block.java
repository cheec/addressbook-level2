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
    public int getBlockNum() {
        return this.block;
    }
    
    public static boolean isValidBlock(String testBlock) {
        return testBlock.trim().matches(BLOCK_VALIDATION_REGEX);
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + block;
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
        Block other = (Block) obj;
        return this.block == other.block;
    }
    
    @Override
    public String toString() {
        return "" + this.block;
    }
}
