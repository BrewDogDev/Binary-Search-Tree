import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @version 4/7/2018 a test class for a BnodeADT named Bnode IMP
 */
public class BnodeIMPTest {
    /**
     * makes node a makes node b sets b to kid of a checks that lkid returns b
     */
    @Test
    public void testLkidWithKid() {
        BnodeIMP a = new BnodeIMP();
        BnodeIMP b = new BnodeIMP();
        a.setLkidTo(b);
        a.toString(); // just to get 100% code coverage
        assertEquals(a.lkid(), b);
    }

    /**
     * makes node a a has no kids by default so kids should be null checks lkid
     * is null
     */
    @Test
    public void testLkidNoKid() {
        BnodeIMP a = new BnodeIMP();
        assertEquals(a.lkid(), null);
    }

    //////// END LKID
    /**
     * makes node a a has no kids by default checks isleaf is true
     */
    @Test
    public void testIsLeafNoKids() {
        BnodeIMP a = new BnodeIMP();
        assertTrue(a.isLeaf());
    }

    /**
     * makes node a makes node b sets b to right kid of a checks isleaf is false
     */
    @Test
    public void testIsLeafRkid() {
        BnodeIMP a = new BnodeIMP();
        BnodeIMP b = new BnodeIMP();
        a.setRkidTo(b);
        assertFalse(a.isLeaf());
    }

    /**
     * makes node a makes node b sets b to left kid of a checks isleaf is false
     */
    @Test
    public void testIsLeafLkid() {
        BnodeIMP a = new BnodeIMP();
        BnodeIMP b = new BnodeIMP();
        a.setLkidTo(b);
        assertFalse(a.isLeaf());
    }

    /**
     * makes nodes a, b, c sets b to left kid of a sets c to right kid of a
     * checks isleaf is false
     */
    @Test
    public void testIsLeaf2Kids() {
        BnodeIMP a = new BnodeIMP();
        BnodeIMP b = new BnodeIMP();
        BnodeIMP c = new BnodeIMP();
        a.setLkidTo(b);
        a.setRkidTo(c);
        assertFalse(a.isLeaf());
    }

    // end IsLEaft
    /**
     * makes node a and b sets b to right kid of a checks that rkid is b
     */
    @Test
    public void testRkidWithKid() {
        BnodeIMP a = new BnodeIMP();
        BnodeIMP b = new BnodeIMP();
        a.setRkidTo(b);
        assertEquals(a.rkid(), b);
    }

    /**
     * makes node a a has no kids by default and kids should be null checks that
     * rkid is null
     */
    @Test
    public void testRkidNoKid() {
        BnodeIMP a = new BnodeIMP();
        assertEquals(a.rkid(), null);
    }

    // end Rkid
    /**
     * makes nodes a and b sets b to left kid of a checks lkid of ais b makes
     * lkid of anull checks lkid of a is null
     */
    @Test
    public void testSetLkidToNullFromBnode() {
        BnodeIMP a = new BnodeIMP();
        BnodeIMP b = new BnodeIMP();
        a.setLkidTo(b);
        assertEquals(a.lkid(), b);
        a.setLkidTo(null);
        assertEquals(a.lkid(), null);
    }

    /**
     * makes node a and b sets lkid of a to b checks lkid of a is b
     */
    @Test
    public void testSetLkidToBnode() {
        BnodeIMP a = new BnodeIMP();
        BnodeIMP b = new BnodeIMP();
        a.setLkidTo(b);
        assertEquals(a.lkid(), b);
    }

    /**
     * creats nodes a and b creates node c by using a.setLkidTo which should
     * return itself(theBnode) checks that c is a
     */
    @Test
    public void testSetLkidReturnsSelf() {
        BnodeIMP a = new BnodeIMP();
        BnodeIMP b = new BnodeIMP();
        BnodeIMP c = (BnodeIMP) a.setLkidTo(b);
        assertEquals(a, c);
    }

    // End SetLkid
    /**
     * makes nodes a and b sets rkid of a to b checks rkid of a is b sets rkid
     * of ato null checks rkid of ais null
     */
    @Test
    public void testSetRkidToNullFromBnode() {
        BnodeIMP a = new BnodeIMP();
        BnodeIMP b = new BnodeIMP();
        a.setRkidTo(b);
        assertEquals(a.rkid(), b);
        a.setRkidTo(null);
        assertEquals(a.rkid(), null);
    }

    /**
     * makes nodes a and b sets b rkid of a to b checks rkid of a is b
     */
    @Test
    public void testSetRkidToBnode() {
        BnodeIMP a = new BnodeIMP();
        BnodeIMP b = new BnodeIMP();
        a.setRkidTo(b);
        assertEquals(a.rkid(), b);
    }

    /**
     * creats nodes a and b creates node c by using a.setRkidTo which should
     * return itself(theBnode) checks that c is a
     */
    @Test
    public void testSetRkidReturnsSelf() {
        BnodeIMP a = new BnodeIMP();
        BnodeIMP b = new BnodeIMP();
        BnodeIMP c = (BnodeIMP) a.setRkidTo(b);
        assertEquals(a, c);
    }

    // end setRkid
    /**
     * makes node a sets val of a to Character 'c' checks val of a is 'c'
     */
    @Test
    public void testSetValToCharacter() {
        BnodeIMP a = new BnodeIMP();
        a.setValTo(new Character('c'));
        assertEquals(a.val(), new Character('c'));
    }

    /**
     * makes node a sets val of a to character 'c' checks val of a is 'c' sets
     * val of a to null checks val of a is null
     */
    @Test
    public void testSetValToNullFromCharacter() {
        BnodeIMP a = new BnodeIMP();
        a.setValTo(new Character('c'));
        assertEquals(a.val(), new Character('c'));
        a.setValTo(null);
        assertEquals(a.val(), null);
    }

    /**
     * makes node a val of a by default should be null checks that val of a is
     * null
     */
    @Test
    public void testSetValUnset() {
        BnodeIMP a = new BnodeIMP();
        assertEquals(a.val(), null);
    }

    /**
     * makes node a makes node b by using a.setValTo which should return
     * itself(theBnode)
     */
    @Test
    public void testSetValReturnsSelf() {
        BnodeIMP a = new BnodeIMP();
        BnodeIMP b = (BnodeIMP) a.setValTo(null);
        assertEquals(a, b);
    }

    // end setValTo
    /**
     * makes node a by defaul val of a should be null checks val of a is null
     */
    @Test
    public void testValUnset() {
        BnodeIMP a = new BnodeIMP();
        assertEquals(a.val(), null);
    }

    /**
     * makes node a sets val of a to charactetr 'c' checks val of a is 'c' sets
     * cal of a to character 'd' checks val of a is 'd'
     */
    @Test
    public void testValSetToCharacterFromCharacter() {
        BnodeIMP a = new BnodeIMP();
        a.setValTo(new Character('c'));
        assertEquals(a.val(), new Character('c'));
        a.setValTo(new Character('d'));
        assertEquals(a.val(), new Character('d'));
    }

    // end testVal
}
