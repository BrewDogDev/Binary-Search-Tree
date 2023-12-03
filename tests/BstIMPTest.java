import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @version 4/9/2018
 */
public class BstIMPTest {

    @Test
    public void testBstIMP() {
        fail("Not yet implemented");// dont implement because its not in the
                                    // ADT???
    }

////////// end BSTIMP()
    /**
     * tests add creats BSTIMP bst adds Char a to bst checks that tostring
     * returns "[a]"
     */
    @Test
    public void testAdd1Element() {
        BstIMP bst = new BstIMP();
        bst.add('d');
        assertEquals("[d]", bst.toString());
    }

    /**
     * tests add creats BSTIMP bst adds Char d to bst adds char c to bst checks
     * that tostring returns "[d, c, -]"
     */
    @Test
    public void testAdd2ElementsLeft() {
        BstIMP bst = new BstIMP();
        bst.add('d');
        bst.add('c');
        assertEquals("[d, c, -]", bst.toString());
    }

    /**
     * tests add creats BSTIMP bst adds Char d to bst adds char e to bst checks
     * that tostring returns "[d, -, e]"
     */
    @Test
    public void testAdd2ElementsRight() {
        BstIMP bst = new BstIMP();
        bst.add('d');
        bst.add('e');
        assertEquals("[d, -, e]", bst.toString());
    }

    /**
     * tests add creats BSTIMP bst adds Char d to bst adds char c to bst adds
     * char e to bst checks that tostring returns "[d, c, e]"
     */
    @Test
    public void testAdd3Elements() {
        BstIMP bst = new BstIMP();
        bst.add('d');
        bst.add('c');
        bst.add('e');
        assertEquals("[d, c, e]", bst.toString());
    }

    /**
     * tests add returns self
     */
    @Test
    public void testAddReturnsSelf() {
        BstIMP bst = new BstIMP();
        BstADT retVal = bst.add('d');
        assertEquals(bst, retVal);
    }

    /**
     * tests add creats BSTIMP bst adds Char d to bst adds char c to bst adds
     * char b to bst adds char a to bst checks that tostring returns "[d, c, -,
     * b, -, -, -, a, -, -, -, -, -, -, -]"
     */
    @Test
    public void testAddOnlyToLeftSide() {
        BstIMP bst = new BstIMP();
        bst.add('d');
        bst.add('c');
        bst.add('b');
        bst.add('a');
        assertEquals("[d, c, -, b, -, -, -, a, -, -, -, -, -, -, -]",
                bst.toString());
    }

    /**
     * tests add creats BSTIMP bst adds Char a to bst adds char b to bst adds
     * char c to bst adds char d to bst checks that tostring returns "[a, -, b,
     * -, -, -, c, -, -, -, -, -, -, -, d]"
     */
    @Test
    public void testAddOnlyToRightSide() {
        BstIMP bst = new BstIMP();
        bst.add('a');
        bst.add('b');
        bst.add('c');
        bst.add('d');
        assertEquals("[a, -, b, -, -, -, c, -, -, -, -, -, -, -, d]",
                bst.toString());
    }

    /**
     * tests add creats BSTIMP bst adds Char a to bst adds char b to bst adds
     * char c to bst adds char d to bst checks that tostring returns "[d, b, f,
     * a, c, e, g]"
     */
    @Test
    public void testAddFullTree() {
        BstIMP bst = new BstIMP();
        bst.add('d');
        bst.add('b');
        bst.add('a');
        bst.add('c');
        bst.add('f');
        bst.add('e');
        bst.add('g');
        assertEquals("[d, b, f, a, c, e, g]", bst.toString());
    }

////////// end add()/// done in theory
    /**
     * tests countof makes new BSTIMP bst doesnt add anything to bst checks
     * .countOf returns 0
     */
    @Test
    public void testCountOfEmptyTree() {
        BstIMP bst = new BstIMP();
        assertEquals(new Integer(0), bst.countOf('a'));
    }

    /**
     * tests countof makes new BSTIMP bst makes full tree using .mkFull : "[d,
     * b, f, a, c, e, g]" checks .countOf(h) returns 7
     */
    @Test
    public void testCountOfValueGreaterThanAll() {
        BstIMP bst = new BstIMP();
        bst.mkFull();
        assertEquals(new Integer(7), bst.countOf('h'));
    }

    /**
     * tests countof makes new BSTIMP bst sets equal to full tree using .mkfull
     * : "[d, b, f, a, c, e, g]" checks that .countOf(A) returns 0
     */
    @Test
    public void testCountOfValueLessThanAll() {
        BstIMP bst = new BstIMP();
        bst.mkFull();
        assertEquals(new Integer(0), bst.countOf('A'));
    }

    /**
     * tests countof makes new BSTIMP bst sets equal to full tree using .mkfull
     * : "[d, b, f, a, c, e, g]" checks that .countOf(d) returns 0
     */
    @Test
    public void testCountOfValueInTheMiddle() {
        BstIMP bst = new BstIMP();
        bst.mkFull();
        assertEquals(new Integer(3), bst.countOf('d'));
    }

////////// end countof()//done in theory
    /**
     * tests find
     * makes new full tree bst
     * checks that find(a,b,c,d,e,f,g) return true
     */
    @Test
    public void testFindFullTree() {
        BstIMP bst = new BstIMP();
        bst.mkFull();
        assertTrue(bst.find('a') && bst.find('b') && bst.find('c')
                && bst.find('d') && bst.find('e') && bst.find('f')
                && bst.find('g'));
    }
    /**
     * tests find
     * makes new full tree bst
     * checks that find(h) returns false
     */
    @Test
    public void testFindValueNotThere() {
        BstIMP bst = new BstIMP();
        bst.mkFull();
        assertFalse(bst.find('h'));
    }
    /**
     * tests find
     * makes new full tree bst
     * checks that find(null) returns false
     */
    @Test
    public void testFindNull() {
        BstIMP bst = new BstIMP();
        bst.mkFull();
        assertFalse(bst.find(null));
    }
////////// end FIND()///done in theory
    /**
     * tests height
     * creates new empty tree 
     * adds nothing to it
     * checks that height is 0
     */
    @Test
    public void testHeightEmptyTree() {
        BstIMP bst = new BstIMP();
        assertEquals(new Integer(0),bst.height());
    }
    /**
     * tests height
     * creates new empty tree 
     * adds  1 node to it
     * checks that height is 1
     */
    @Test
    public void testHeightTree1Node() {
        BstIMP bst = new BstIMP();
        bst.add('a');
        assertEquals(new Integer(1),bst.height());
    }
    /**
     * tests height
     * creates new empty tree 
     * adds  d,c,b,a to it in that order : [d, c, -, b, -, -, -, a, -, -, -, -, -, -, -]
     * checks that height is 4
     */
    @Test
    public void testHeightAddingOnlyToleft() {
        BstIMP bst = new BstIMP();
        bst.add('d');
        bst.add('c');
        bst.add('b');
        bst.add('a');
        assertEquals(new Integer(4),bst.height());
    }
    /**
     * tests height
     * creates new empty tree 
     * adds  a,b,c,d to it in that order : [a, -, b, -, -, -, c, -, -, -, -, -, -, -, d]
     * checks that height is 4
     */
    @Test
    public void testHeightAddingOnlyToRight() {
        BstIMP bst = new BstIMP();
        bst.add('a');
        bst.add('b');
        bst.add('c');
        bst.add('d');
        assertEquals(new Integer(4),bst.height());
    }
    /**
     * tests height
     * creates new empty tree 
     * makes tree full using .mkfull :  [d, b, f, a, c, e, g]
     * checks that height is 3
     */
    @Test
    public void testHeightFullTree() {
        BstIMP bst = new BstIMP();
        bst.mkFull();
        assertEquals(new Integer(3),bst.height());
    }
////////// end Height()//done in theory
    /**
     * makes BSTIMP bst runs mkfull on bst checks if bst is full tree: "[d, b,
     * f, a, c, e, g]"
     */
    @Test
    public void testMkFullSetsToFullTree() {
        BstIMP bst = new BstIMP();
        bst.mkFull();
        assertEquals("[d, b, f, a, c, e, g]", bst);
    }

    /**
     * makes BSTIMP bst sets retVal equal to bst.mkfull checks if bst is equal
     * to retVal
     */
    @Test
    public void testMkFullReturnsSelf() {
        BstIMP bst = new BstIMP();
        BstIMP retVal = (BstIMP) bst.mkFull();
        assertEquals(bst, retVal);
    }

////////// end MKFULL()//done intheory
    /**
     * tests Preorder
     * creates new empty tree 
     * makes tree full using .mkfull :  [d, b, f, a, c, e, g]
     * checks .preorder returns "dbacfeg"
     */
    @Test
    public void testPreorderFullTree() {
        BstIMP bst = new BstIMP();
        bst.mkFull();
        assertEquals("dbacfeg",bst.preorder());
    }
    /**
     * tests Preorder
     * creates new empty tree 
     * adds nothing to the tree : []
     * checks .preorder returns ""
     */
    @Test
    public void testPreorderEmptyTree() {
        BstIMP bst = new BstIMP();
        assertEquals("",bst.preorder());//presumably this is what it should return
    }
    /**
     * tests Preorder
     * creates new empty tree 
     * adds dcba to the tree in that order: [d, c, -, a, -, -, -, b, -, -, -, -, -, -, -]
     * checks .preorder returns "dcae"
     */
    @Test
    public void testPreorderLeftSidedTree() {
        BstIMP bst = new BstIMP();
        bst.add('d');
        bst.add('c');
        bst.add('b');
        bst.add('a');
        assertEquals("dcba",bst.preorder());
    }
    /**
     * tests Preorder
     * creates new empty tree 
     * adds abcd to the tree in that order: [a, -, b, -, -, -, c, -, -, -, -, -, -, -, d]
     * checks .preorder returns "abcd"
     */
    @Test
    public void testPreorderRightSidedTree() {
        BstIMP bst = new BstIMP();
        bst.add('a');
        bst.add('b');
        bst.add('c');
        bst.add('d');
        assertEquals("abcd",bst.preorder());
    }
    /**
     * tests Preorder
     * creates new empty tree 
     * makes full tree using .mkfull :  [d, b, f, a, c, e, g]
     * removes c
     * checks .preorder returns "dbafeg"
     */
    @Test
    public void testPreorderTreeWithGaps() {
        BstIMP bst = new BstIMP();
        bst.mkFull();
        bst.remove('c');
        assertEquals("dbafeg",bst.preorder());
    }

    ////////// end Preorder()//done in theory
    /**
     * tests remove
     * creates new tree
     * makes tree full using .mkfull : [d, b, f, a, c, e, g]
     * removes c from tree using .remove : [d, b, f, a, -, e, g]
     * checks that tree = [d, b, f, a, -, e, g] using tostring
     */
    @Test
    public void testRemoveLeafLeft() {
        BstIMP bst = new BstIMP();
        bst.mkFull();
        bst.remove('c');
        assertEquals("[d, b, f, a, -, e, g]",bst.toString());
    }
    /**
     * tests remove
     * creates new tree
     * makes tree full using .mkfull : [d, b, f, a, c, e, g]
     * removes e from tree using .remove : [d, b, f, a, c, -, g]
     * checks that tree = [d, b, f, a, c, -, g] using tostring
     */
    @Test
    public void testRemoveLeafRight() {
        BstIMP bst = new BstIMP();
        bst.mkFull();
        bst.remove('e');
        assertEquals("[d, b, f, a, c, -, g]",bst.toString());
    }
    /**
     * tests remove
     * creates new tree
     * makes tree full using .mkfull : [d, b, f, a, c, e, g]
     * removes b from tree using .remove : [d, a, f, -, c, e, g] // assumes remove method is optimized to make trees non degenerate
     * checks that tree = [d, a, f, -, c, e, g] using tostring
     */
    @Test
    public void testRemoveMiddle() {
        BstIMP bst = new BstIMP();
        bst.mkFull();
        bst.remove('b');
        assertEquals("[d, a, f, -, c, e, g]",bst.toString());
    }
    /**
     * tests remove
     * creates new tree
     * makes tree full using .mkfull : [d, b, f, a, c, e, g]
     * removes d from tree using .remove : [c, b, f, a, -, e, g] // assumes remove method is optimized to make trees non degenerate
     * checks that tree = [d, a, f, -, c, e, g] using tostring
     */
    @Test
    public void testRemoveRoot() {
        BstIMP bst = new BstIMP();
        bst.mkFull();
        bst.remove('d');
        assertEquals("[c, b, f, a, -, e, g]",bst.toString());
    }

    ////////// end Remove()//done in theory
    /**
     * creates new BSTIMP bst adds no nodes to it checks to see if bst.size is
     * equal to 0
     */
    @Test
    public void testSizeNoNodes() {
        BstIMP bst = new BstIMP();
        assertEquals(new Integer(0), bst.size());
    }

    /**
     * creates new BSTIMP bst adds 1 item to it checks to see if bst.size is
     * equal to 1
     */
    @Test
    public void testSize1Node() {
        BstIMP bst = new BstIMP();
        bst.add('a');
        assertEquals(new Integer(1), bst.size());
    }

    /**
     * creates new BSTIMP bst adds b,a,c to it in that order checks to see if
     * bst.size is equal to 3
     */
    @Test
    public void testSize3NodesNoGaps() {
        BstIMP bst = new BstIMP();
        bst.add('b');
        bst.add('a');
        bst.add('c');
        assertEquals(new Integer(3), bst.size());
    }

    /**
     * creates new BSTIMP bst adds b,a,c to it in that order checks to see if
     * bst.size is equal to 3
     */
    @Test
    public void testSize2Nodes1Gap() {
        BstIMP bst = new BstIMP();
        bst.add('b');
        bst.add('c');
        assertEquals(new Integer(2), bst.size());
    }

    /**
     * creates new BSTIMP bst makes bst : "[d, b, f, a, c, e, g]" checks to see
     * if bst.size is equal to 7
     */
    @Test
    public void testSizeFullTree() {
        BstIMP bst = new BstIMP();
        bst.mkFull();
        assertEquals(new Integer(7), bst.size());
    }

    /**
     * creates new BSTIMP bst makes bst : "[d, c, e, b, -, -, -]" checks to see
     * if bst.size is equal to 4
     */
    @Test
    public void testSizeTreeWithGaps() {
        BstIMP bst = new BstIMP();
        bst.add('d');
        bst.add('c');
        bst.add('b');
        bst.add('e');
        assertEquals(new Integer(4), bst.size());
    }
    ////////// end Size()//done in theory

}
