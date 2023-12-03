/**
 * ???
 * 
 * @version 4/7/2018
 */
public class BnodeIMP implements BnodeADT {
    /**
     * right child of this Bnode null by default if both right and left are
     * null==> this Bnode is a leaf
     */
    BnodeADT right = null;
    /**
     * left child of this Bnode null by default if both right and left are
     * null==> this Bnode is a leaf
     */
    BnodeADT left = null;
    /**
     * Character value this Bnode holds null by default
     */
    Character value = null;

    /*
     * (non-Javadoc)
     * 
     * @see BnodeADT#lkid()
     */
    @Override
    public BnodeADT lkid() {
        return left;
    }

    /*
     * (non-Javadoc)
     * 
     * @see BnodeADT#isLeaf()
     */
    @Override
    public Boolean isLeaf() {
        return left == null && right == null; // works i think
    }

    /*
     * (non-Javadoc)
     * 
     * @see BnodeADT#rkid()
     */
    @Override
    public BnodeADT rkid() {
        return right;
    }

    /*
     * (non-Javadoc)
     * 
     * @see BnodeADT#setLkidTo(BnodeADT)
     */
    @Override
    public BnodeADT setLkidTo(BnodeADT n) {
        left = n;
        return this;
    }

    /*
     * (non-Javadoc)
     * 
     * @see BnodeADT#setRKidTo(BnodeADT)
     */
    @Override
    public BnodeADT setRkidTo(BnodeADT n) {
        right = n;
        return this;
    }

    /*
     * (non-Javadoc)
     * 
     * @see BnodeADT#setValTo(java.lang.Character)
     */
    @Override
    public BnodeADT setValTo(Character c) {
        value = c;
        return this;
    }

    /*
     * (non-Javadoc)
     * 
     * @see BnodeADT#val()
     */
    @Override
    public Character val() {
        return value;
    }

    /*
     * (non-Javadoc)
     * 
     * @see BnodeADT#toString()
     */
    @Override
    public String toString() {
        // DO NOT CHANGE THIS CODE
        return BnodeUtils.toString(this);
    }

}
