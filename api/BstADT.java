/**
 * <!-- ASG2b
 * 
 * <pre>
 * INSTRUCTIONS FOR READING THIS ASSIGNMENT:
 * 1. Create an Eclipse project for this assignment.
 * 2. Import this file into that project.
 * 3. In Eclipse, right-click the imported file and select Export/Java/JavaDoc
 * 4. Note the destination (look for this in the bottom 1/3 of the dialog box
 * 5. Click Finish
 * 6. Find the index.html file and double click it.
 * </pre>
 * 
 * -->
 * <h1>Asg2b: Binary Search Tree</h1>
 * <h2>Objectives</h2>
 * <ul>
 * <li>develop/improve your ability to implement a BstADT given its ADT</li>
 * <li>develop/improve your ability to write JUnit tests</li>
 * <li>develop/improve your ability to write readable code according to best
 * practices</li>
 * </ul>
 * <h2>Introduction</h2>
 * <p>
 * The BstADT defines the API for a Binary Search Tree. Note that a newly
 * created BstADT is empty.
 * </p>
 * <h3>Description</h3>
 * <p>
 * Refer to the notes and book for a description of a Binary Search Tree. Our
 * Binary Search Tree will store Characters.
 * </p>
 * <h3>Fluent Programming Style</h3>
 * <p>
 * Note that there are no void methods here. Methods that would normally be void
 * return the this Object so that method calls can be chained. For example:
 * </p>
 * 
 * <pre>
 * Suppose SetADT foo = new SetImplementation();
 * Then foo.add("a").add("b"); produces the same result as
 * foo.add("a");
 * foo.add("b");
 * </pre>
 * <p>
 * Your task is to implement this ADT, develop a JUnit test class, and document
 * both using Javadoc.
 * </p>
 * <h2>Instructions</h2>
 * <ul>
 * <li>Study the code in the textbook.</li>
 * <li>Your implementation MUST use the {@link BnodeADT} provided in this
 * project.</li>
 * <li>Your implementation should store Characters.</li>
 * <li>Your implementation should not use Generics.</li>
 * <li>Write the Javadoc for the JUnit class and the implementation.</li>
 * <li>Write the JUnit tests for the ADT described by this API.</li>
 * <li>Implement, using the examples in the book, the ADT described by this
 * API.</li>
 * <li>You may NOT use any pre-existing classes that defeat the purposes of this
 * assignment (ex. Tree, ArrayList, etc.)</li>
 * <li>Submit your files to Web-CAT using the eclipse menu
 * "{@code Project->Submit
 * Assignment...}"</li>
 * <li>To see my comments after I've graded your work, or to see your results at
 * any time, login to http://web-cat.cs.vt.edu</li>
 * </ul>
 * <h2>Practical Tips</h2>
 * <p>
 * Develop preliminary JUnit tests before you implement the methods, using the
 * process described in class and the slides. For example, develop tests for a
 * method, implement the method, run the tests. Do this until the method passes
 * the tests. Go on to the next method.
 * </p>
 * <p>
 * Sometimes you may have to implement a little bit as well in order to write
 * your JUnit tests. The process involves switching between JUnit tests and
 * implementation, in order to develop a good understanding of the problems to
 * be solved.
 * </p>
 * <h2>NOTES</h2>
 * <ul>
 * <li>Any submission that that uses pre-existing classes (other than BnodeADT)
 * that fundamentally implement what this assignment is asking you to implement,
 * will receive NO CREDIT.</li>
 * <li>You may submit as many times as you like until the deadline.</li>
 * <li>The grade of your latest submission will be the one recorded.</li>
 * </ul>
 * <h2>CHECKLISTS</h2>
 * <p>
 * Check that you have done all the following.
 * </p>
 * <table border="1" summary="Checklists">
 * <tr>
 * <td>DONE?</td>
 * <td>TASK</td>
 * </tr>
 * <tr>
 * <td>.</td>
 * <td>The implementing class for this assignment is named BstIMP</td>
 * </tr>
 * <tr>
 * <td>.</td>
 * <td>All methods specified in the ADT are implemented</td>
 * </tr>
 * <tr>
 * <td>.</td>
 * <td>Only the ADT methods and any constructors may be declared public. Any
 * other methods declared public will result in point deductions.</td>
 * </tr>
 * <tr>
 * <td>.</td>
 * <td>Fields used as variables may NOT be declared public.</td>
 * </tr>
 * <tr>
 * <td>.</td>
 * <td>Code is formatted as described in piazza</td>
 * </tr>
 * <tr>
 * <td>.</td>
 * <td>Javadoc is present in the implementation and JUnit class headers as well
 * as all non-private fields and ALL methods, as described in piazza</td>
 * </tr>
 * <tr>
 * <td>.</td>
 * <td>Class header javadoc must include a brief description of the class, and
 * the &#64;author and &#64;version tags</td>
 * </tr>
 * </table>
 * <p>
 * Here is a table of some common things I look for when reviewing your code:
 * <a href=
 * "https://piazza-resources.s3.amazonaws.com/j6cf19dpqik109/j7qk5asq32652g/codingcomments20170918.pdf?AWSAccessKeyId=AKIAIEDNRLJ4AZKBW6HA&Expires=1505848559&Signature=lGyzsnCmvrE1r6I%2BGTkCLfoZw70%3D">
 * Coding Comments Table</a>
 * </p>
 * <p>
 * Check that you read and followed these how-to items in piazza.
 * </p>
 * <table border="1" summary="Checks">
 * <tr>
 * <td>DONE?</td>
 * <td>TASK</td>
 * </tr>
 * <tr>
 * <td>.</td>
 * <td>Read: how to write JUnit tests</td>
 * </tr>
 * <tr>
 * <td>.</td>
 * <td>Read: how to write readable code (and satisfy Web-CAT's format
 * checks)</td>
 * </tr>
 * <tr>
 * <td>.</td>
 * <td>Read: setup Eclipse for Web-CAT</td>
 * </tr>
 * <tr>
 * <td>.</td>
 * <td>Watch: video: setup eclipse to format your code for Web-CAT</td>
 * </tr>
 * <tr>
 * <td>.</td>
 * <td>Read: submit your assignment to Web-CAT from within Eclipse</td>
 * </tr>
 * <tr>
 * <td>.</td>
 * <td>Video: find formatting or code coverage errors in my source code</td>
 * </tr>
 * </table>
 *
 * @author acsiochi
 * @version 20180316 Initial version
 */
public interface BstADT {

    /**
     * <p>
     * Add the given Character into this Binary Search Tree. The resulting tree
     * must still be a Binary Search Tree.
     * </p>
     * <h3>THIS MUST BE DONE RECURSIVELY</h3>
     * <p>
     * No credit will be awarded for non-recursive solutions.
     * </p>
     * 
     * <h3>Example</h3>
     * <p>
     * The [a, ...] notation used here is the output of the toString() method.
     * See {@link BstADT#toString()} for details.
     * </p>
     * 
     * <pre>
     * {@code
     * Given BstADT t == [d, b, f, a, -, e, g] or graphically:
     *      d
     *    /   \
     *   b     f
     *  /     / \
     * a     e   g
     * 
     * when BstADT s = t.add('c')
     * then t == [d, b, f, a, c, e, g] or graphically:
     *      d
     *    /   \
     *   b     f
     *  / \   / \
     * a   c e   g
     * 
     * and s == t
     * }
     * </pre>
     * 
     * @param c item to add
     * @return address of this BstADT
     */
    public BstADT add(Character c);

    /**
     * <p>
     * Count the number of nodes in this BstADT whose values are less than the
     * given Character. The given Character does NOT need to be in the BstADT.
     * </p>
     * <h3>THIS MUST BE DONE RECURSIVELY</h3>
     * <p>
     * No credit will be awarded for non-recursive solutions.
     * </p>
     * <p>
     * In addition, this must be done using the tree itself. For example, it is
     * NOT allowed to get a traversal of the tree and examine that string,
     * counting characters that are less than the given character.
     * </p>
     * <h3>Example</h3>
     * 
     * <pre>
     * {@code
     * Given BstADT t == [d, b, f, a, c, e, g] or graphically:
     *      d
     *    /   \
     *   b     f
     *  / \   / \
     * a   c e   g
     * 
     * when Integer s = t.countOf('f')
     * then s == 5
     * }
     * </pre>
     * 
     * @param c the Character used to determine whether a node is counted
     * @return the number of nodes with values less than c
     */
    public Integer countOf(Character c);

    /**
     * <p>
     * Determine if the given Character is in this BstADT or not.
     * </p>
     * <h3>THIS MUST BE DONE RECURSIVELY</h3>
     * <p>
     * No credit will be awarded for non-recursive solutions.
     * </p>
     * <h3>Example</h3>
     * 
     * <pre>
     * {@code
     * Given BstADT t == [d, b, f, a, -, e, g] or graphically:
     *      d
     *    /   \
     *   b     f
     *  /     / \
     * a     e   g
     * 
     * when Boolean fc = t.find('c')
     *  and Boolean fa = t.find('a')
     * then fc == false
     *  and fa == true
     * }
     * </pre>
     * 
     * @param c item to find
     * @return true if c is in this Bst, false else
     */
    public Boolean find(Character c);

    /**
     * <p>
     * Determine the height of this tree. The height of a tree is the length of
     * the longest path from the root to a leaf. The height of an empty tree is
     * 0.
     * </p>
     * <h3>THIS MUST BE DONE RECURSIVELY</h3>
     * <p>
     * No credit will be awarded for non-recursive solutions.
     * </p>
     * <h3>Example</h3>
     * 
     * <pre>
     * {@code
     * Given BstADT t == [d, b, f, a, c, -, -] or graphically:
     *      d
     *    /   \
     *   b     f
     *  / \      
     * a   c      
     * 
     * when Integer s = t.height()
     * then s == 3
     * }
     * </pre>
     * 
     * @return the height of this tree
     */
    public Integer height();

    /**
     * <p>
     * Make the binary search tree shown below using ONLY the BnodeADT methods.
     * You may NOT use the BstADT add() method.
     * </p>
     * <h3>Example</h3>
     * 
     * <pre>
     * {@code
     * Given BstADT t
     *  when BstADT s = t.mkFull()
     *  then t == [d, b, f, a, c, e, g] or graphically:
     *      d
     *    /   \
     *   b     f
     *  / \   / \
     * a   c e   g
     * 
     * and s == t
     * }
     * </pre>
     * 
     * @return the address of t
     */
    public BstADT mkFull();

    /**
     * <p>
     * Return a string that is the preorder traversal of this BstADT.
     * </p>
     * <h3>THIS MUST BE DONE RECURSIVELY</h3>
     * <p>
     * No credit will be awarded for non-recursive solutions.
     * </p>
     * <h3>Example</h3>
     * 
     * <pre>
     * {@code
     * Given BstADT t == [d, b, f, a, -, e, g] or graphically:
     *      d
     *    /   \
     *   b     f
     *  /     / \
     * a     e   g
     * 
     * when String s = t.preorder()
     * then s == "dbafeg"
     * }
     * </pre>
     * 
     * @return the preorder traversal of this BstADT
     */
    public String preorder();

    /**
     * <p>
     * Remove the given Character from this BstADT. If it is not possible to
     * remove the given Character, this method should fail silently and make no
     * changes to the tree.
     * </p>
     * <h3>THIS MUST BE DONE RECURSIVELY</h3>
     * <p>
     * No credit will be awarded for non-recursive solutions.
     * </p>
     * <h3>Example</h3>
     * 
     * <pre>
     * {@code
     * Given BstADT t == [d, b, f, a, c, e, g] or graphically:
     *      d
     *    /   \
     *   b     f
     *  / \   / \
     * a   c e   g
     * 
     * when BstADT s = t.remove('c')
     * then t == [d, b, f, a, -, e, g] or graphically:
     *      d
     *    /   \
     *   b     f
     *  /     / \
     * a     e   g
     * 
     * and s == t
     * }
     * </pre>
     * 
     * @param c the Character to remove
     * @return the address of this BstADT
     */
    public BstADT remove(Character c);

    /**
     * <p>
     * Determine how many nodes are in this BstADT.
     * </p>
     * <h3>THIS MUST BE DONE RECURSIVELY</h3>
     * <p>
     * No credit will be awarded for non-recursive solutions.
     * </p>
     * <h3>Example</h3>
     * 
     * <pre>
     * {@code
     * Given BstADT t == [d, b, f, a, -, e, g] or graphically:
     *      d
     *    /   \
     *   b     f
     *  /     / \
     * a     e   g
     * when Integer s = t.size()
     * then s == 6
     * }
     * </pre>
     * 
     * @return number of nodes in this BstADT
     */
    public Integer size();

    /**
     * <h3>DO NOT IMPLEMENT THIS METHOD. IT WILL BE IN THE ASSIGNMENT ZIP FILE
     * YOU DOWNLOAD.</h3>
     * <p>
     * A string listing the nodes of this tree level by level. Null nodes are
     * indicated by '-' and the nodes on a level are listed from left to right.
     * </p>
     * <h3>Example</h3>
     * 
     * <pre>
     * {@code
     * Given BstADT t ==
     *      d
     *    /   \
     *   b     f
     *  /     / \
     * a     e   g
     * 
     * when String s = t.toString()
     * then s == "[d, b, f, a, -, e, g]"
     * 
     * Given BstADT x ==
     *      d
     *        \
     *         f
     *        / \
     *       e   g
     * 
     * when String s = x.toString()
     * then s == "[d, -, f, -, -, e, g]"
     * 
     * Given BstADT y ==
     *      d
     * 
     * when String s = x.toString()
     * then s == "[d]"
     * }
     * </pre>
     * 
     * @return the nodes level by level of this tree
     */
    public String toString();

}
