/**
 * 
 * <h1>Binary Tree Node</h1>
 * <h2>DO NOT IMPLEMENT THIS CLASS. YOU MUST USE WHAT IS PROVIDED IN THE
 * ASSIGNMENT ZIP FILE YOU DOWNLOADED.</h2>
 * <p>
 * A BstADT uses the BnodeADT for a Binary Search Tree node. Note that a newly
 * created BnodeADT is empty.
 * </p>
 * <h3>Description</h3>
 * <p>
 * Refer to the notes and book for a description of a Binary Search Tree Node.
 * Our Binary Search Tree Node will store a Character.
 * </p>
 *
 * @author acsiochi
 * @version 20180403 final for part 2
 */
public interface BnodeADT {

    /**
     * <p>
     * Determine if this BnodeADT is a leaf or not.
     * </p>
     * <h3>Example</h3>
     * 
     * <pre>
     * {@code
     * Given BnodeADT l = ['Q', null, null]
     *   and BnodeADT n == ['c', l, null]
     *   and BnodeADT m == ['P', null, null]
     *  when Boolean k = n.isLeaf()
     *   and Boolean a = m.isLeaf()
     *  then k == false
     *   and a == true
     * }
     * </pre>
     * 
     * @return true if c is a leaf, false else
     */
    public Boolean isLeaf();

    /**
     * <p>
     * Get the address of this BNodeADT's left kid.
     * </p>
     * <h3>Example</h3>
     * 
     * <pre>
     * {@code
     * Given BnodeADT n == ['c', a, b]
     *  when BnodeADT m = n.lkid()
     *  then m == a
     * }
     * </pre>
     * 
     * @return address of the left kid of this BnodeADT
     */
    public BnodeADT lkid();

    /**
     * <p>
     * Get the address of this BnodeADT's right kid.
     * </p>
     * <h3>Example</h3>
     * 
     * <pre>
     * {@code
     * Given BnodeADT n == ['c', a, b]
     *  when BnodeADT m = n.rkid()
     *  then m == b
     * }
     * </pre>
     * 
     * @return address of the right kid of this BnodeADT
     */
    public BnodeADT rkid();

    /**
     * <p>
     * Set the left kid of this BnodeADT to the given address.
     * </p>
     * <h3>Example</h3>
     * 
     * <pre>
     * {@code
     * Given BnodeADT n == ['c', a, b]
     *   and BnodeADT x
     *  when BnodeADT m = n.setLkidTo(x)
     *  then n.lkid() == x
     *   and m == n
     * }
     * </pre>
     * 
     * @param n the address to store in this BnodeADT's left
     * @return the address of this BnodeADT
     */
    public BnodeADT setLkidTo(BnodeADT n);

    /**
     * <p>
     * Set the right kid of this BnodeADT to the given address.
     * </p>
     * <h3>Example</h3>
     * 
     * <pre>
     * {@code
     * Given BnodeADT n == ['c', a, b]
     *   and BnodeADT x
     *  when BnodeADT m = n.setRkidTo(x)
     *  then n.rkid() == x
     *   and m == n
     * }
     * </pre>
     * 
     * @param n the address to store in this BnodeADT's right
     * @return the address of this BnodeADT
     */
    public BnodeADT setRkidTo(BnodeADT n);

    /**
     * <p>
     * Set the Character stored in this BnodeADT to the given Character.
     * </p>
     * <h3>Example</h3>
     * 
     * <pre>
     * {@code
     * Given BnodeADT n == ['c', null, null]
     *  when BnodeADT m = n.setValTo('x')
     *  then n.val() == 'x'
     *   and m == n
     * }
     * </pre>
     * 
     * @param c the Character to store in this BnodeADT
     * @return the address of this BnodeADT
     */
    public BnodeADT setValTo(Character c);

    /**
     * <p>
     * toString returns a string of the form [value, lkid, rkid] or an address,
     * depending on how BnodeUtils.stringAsAddress() was last called.
     * </p>
     * <h3>Example</h3>
     * 
     * <pre>
     * {@code
     * Given BnodeADT a == ['x', null, null];
     *  when BnodeUtils.stringAsAddress(false)
     *   and String s = a.toString();
     *  then s == "['x', null, null]"
     *
     * Given BnodeADT a == ['x', null, null];
     *  when BnodeUtils.stringAsAddress(true)
     *   and String s = a.toString();
     *  then s == @23498769 // a @ followed by a sequence of numbers
     * }
     * </pre>
     * 
     * @return the string representation of this BnodeADT
     */
    public String toString();

    /**
     * <p>
     * Get the Character stored in this BnodeADT.
     * </p>
     * <h3>Example</h3>
     * 
     * <pre>
     * {@code
     * Given BnodeADT n == ['c', null, null]
     *  when Character m = n.val()
     *  then m == 'c'
     * }
     * </pre>
     * 
     * @return value stored in this BnodeADT
     */
    public Character val();

}
