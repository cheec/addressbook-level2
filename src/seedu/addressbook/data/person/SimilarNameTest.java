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
}
