/**
 * ???
 * 
 * @version 4/9/2018
 *
 */
public class BstIMP implements BstADT {

    /** root is the pointer to the root BnodeADT of this tree */
    private BnodeADT root = new BnodeIMP();

    /**
     * 
     */
    public BstIMP() {
        root = null;
    }

    /**
     * helper method to create a new BSTIMP with root equal to paramater c
     * 
     * @param c
     *            inserted into root bnode of this BST
     */
    private BstIMP(Character c) {
        root = new BnodeIMP();
        root.setValTo(c);
    }

    /**
     * helper method to create a BSTIMP out of a BnodeADT
     * 
     * @param rt
     *            bnode adt that will be the root of the new BSTIMP
     */
    private BstIMP(BnodeADT rt) {
        if (rt == null) {
            root = new BnodeIMP();
        }
        else {
            root = rt;
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see BstADT#add(java.lang.Character)
     */
    @Override
    public BstADT add(Character c) {// what if already in the tree????//works
                                    // maybe need to make tostring work before
                                    // can tell from tests
        try {// baseCase
            root.val();
        }
        catch (NullPointerException e) {
            BstIMP rt = new BstIMP(c);
            root = rt.root;
            return rt;
        }
        // recursive
        if (root.val().compareTo(c) < 0) {// root comes first
            BstIMP right = new BstIMP(root.rkid());
            right.add(c);
        }
        else {// c comes first(or is the same)(dunno about duplicates)
            BstIMP left = new BstIMP(root.lkid());
            left.add(c);
        }
        System.out.println(this.toString());
        return this;
    }

    /*
     * (non-Javadoc)
     * 
     * @see BstADT#countOf(java.lang.Character)
     */
    @Override
    public Integer countOf(Character c) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see BstADT#find(java.lang.Character)
     */
    @Override
    public Boolean find(Character c) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see BstADT#height()
     */
    @Override
    public Integer height() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see BstADT#mkFull()
     */
    @Override
    public BstADT mkFull() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see BstADT#preorder()
     */
    @Override
    public String preorder() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see BstADT#remove(java.lang.Character)
     */
    @Override
    public BstADT remove(Character c) {
        // TODO Auto-generated method stub
        return null;

    }

    /*
     * (non-Javadoc)
     * 
     * @see BstADT#size()
     */
    @Override
    public Integer size() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see BstADT#toString()
     */
    @Override
    public String toString() {
        // DO NOT CHANGE THIS METHOD
        return BstUtils.toString(this.root);
    }

}
