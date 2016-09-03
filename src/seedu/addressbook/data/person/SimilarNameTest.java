package seedu.addressbook.data.person;

import static org.junit.Assert.*;

import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;

public class SimilarNameTest {
    private Name n1;
    private Name n2;
    
    @Test
    public void isSimilar_differentNames() throws IllegalValueException {
        n1 = new Name("bob");
        n2 = new Name("sam");
        assertFalse(n1.isSimilar(n2));
    }
    
    @Test
    public void isSimilar_sameNames() throws IllegalValueException {
        n1 = new Name("bob");
        n2 = new Name("bob");
        assertTrue(n1.isSimilar(n2));
    }
    
    @Test
    public void isSimilar_caseInsensitive() throws IllegalValueException {
        n1 = new Name("B");
        n2 = new Name("b");
        assertTrue(n1.isSimilar(n2));
    }
    
    @Test
    public void isSimilar_thisSubsetOfOther() throws IllegalValueException {
        n1 = new Name("jon");
        n2 = new Name("jon smith");
        assertTrue(n1.isSimilar(n2));
    }
    
    @Test
    public void isSimilar_otherSubsetOfThis() throws IllegalValueException {
        n1 = new Name("jon smith");
        n2 = new Name("jon");
        assertTrue(n1.isSimilar(n2));
    }
    
    @Test
    public void isSimilar_otherIsNull() throws IllegalValueException {
        n1 = new Name("jon smith");
        assertFalse(n1.isSimilar(null));
    }
    
    @Test
    public void isSimilar_notSubset() throws IllegalValueException {
        n1 = new Name("jon sam");
        n2 = new Name("jon bob");
        assertFalse(n1.isSimilar(n2));
    }
    
    @Test
    public void isSimilar_differentOrder() throws IllegalValueException {
        n1 = new Name("beep boop");
        n2 = new Name("boop beep");
        assertTrue(n1.isSimilar(n2));
    }
}
