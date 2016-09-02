package seedu.addressbook.common;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class UtilsTest {
    
    /**
     * Tests for isAnyNull() ==============================================
     */
    
    @Test
    public void isAnyNull_onlyNullObjectsArgument() {
        Object o1 = null;
        
        assertTrue(Utils.isAnyNull(o1));
    }
    
    @Test
    public void isAnyNull_someNullObjectsArgument() {
        Object o1 = new Object();
        Object o2 = null;
        Object o3 = new Object();
        Object o4 = null;
        
        assertTrue(Utils.isAnyNull(o1, o2, o3, o4));
    }
    
    @Test
    public void isAnyNull_noArguments() {
        assertFalse(Utils.isAnyNull());
    }
    
    @Test
    public void isAnyNull_noNullArguments() {
        assertFalse(Utils.isAnyNull(new Object(), new Object(), new Object(), new Object()));
    }
    
    /**
     * Tests for elementsAreUnique() ======================================
     */
    
    @Test
    public void elementsAreUnique_someDuplicates() {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(1);
        
        assertFalse(Utils.elementsAreUnique(a));
    }
    
    @Test
    public void elementsAreUnique_noDuplicates() {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        
        assertTrue(Utils.elementsAreUnique(a));
    }
    
    @Test
    public void elementsAreUnique_emptyList() {
        ArrayList<Integer> a = new ArrayList<Integer>();
        
        assertTrue(Utils.elementsAreUnique(a));
    }
    
    @Test
    public void elementsAreUnique_oneElement() {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        
        assertTrue(Utils.elementsAreUnique(a));
    }
}
