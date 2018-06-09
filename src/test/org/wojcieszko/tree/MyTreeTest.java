package test.org.wojcieszko.tree;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.wojcieszko.tree.MyTree;
import org.wojcieszko.tree.MyTreeNode;

/**
 * MyTree Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>cze 8, 2018</pre>
 */
public class MyTreeTest {

    @Before
    public void before() throws Exception {

        MyTree<Integer> myTree = new MyTree(12);


    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getData()
     */
    @Test
    public void testGetData() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: setData(T data)
     */
    @Test
    public void testSetData() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: getLeftLeaf()
     */
    @Test
    public void testGetLeftLeaf() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: setLeftLeaf(MyTreeNode leftLeaf)
     */
    @Test
    public void testSetLeftLeaf() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: getRightLeaf()
     */
    @Test
    public void testGetRightLeaf() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: setRightLeaf(MyTreeNode rightLeaf)
     */
    @Test
    public void testSetRightLeaf() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: getHead()
     */
    @Test
    public void testGetHead() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: setHead(MyTreeNode head)
     */
    @Test
    public void testSetHead() throws Exception {
//TODO: Test goes here... 
    }

    @Test

    public void testAppend() throws Exception {

        MyTreeNode myTreeNode = new MyTreeNode(3);
        MyTree myTree = new MyTree(12);
        myTree.appendLeaf(myTreeNode);

        Assert.assertEquals(myTreeNode, myTree.root.getLeftLeaf());
        Assert.assertEquals(3, myTree.root.getLeftLeaf().getData());
    }

    @Test

    public void testAppend02() throws Exception {

        MyTreeNode myTreeNode1 = new MyTreeNode(30);
        MyTreeNode myTreeNode2 = new MyTreeNode(3);
        MyTreeNode myTreeNode3 = new MyTreeNode(5);
        MyTree myTree = new MyTree(12);
        myTree.appendLeaf(myTreeNode1);
        myTree.appendLeaf(myTreeNode2);
        myTree.appendLeaf(myTreeNode2);
        myTree.appendLeaf(myTreeNode3);

        Assert.assertEquals(30, myTree.root.getRightLeaf().getData());
        Assert.assertEquals(3, myTree.root.getLeftLeaf().getData());
        Assert.assertEquals(5, myTree.root.getLeftLeaf().getRightLeaf().getData());

    }

    @Test
    public void testfind() throws Exception {

        MyTreeNode myTreeNode1 = new MyTreeNode(30);
        MyTreeNode myTreeNode2 = new MyTreeNode(3);
        MyTreeNode myTreeNode3 = new MyTreeNode(5);
        MyTree myTree = new MyTree(12);
        myTree.appendLeaf(myTreeNode1);
        myTree.appendLeaf(myTreeNode2);
        myTree.appendLeaf(myTreeNode2);
        myTree.appendLeaf(myTreeNode3);

        Assert.assertEquals(myTree.findLeaf(myTreeNode1), myTree.root.getRightLeaf());
        Assert.assertEquals(myTree.findLeaf(myTreeNode2), myTree.root.getLeftLeaf());
        Assert.assertEquals(myTree.findLeaf(myTreeNode3), myTree.root.getLeftLeaf().getRightLeaf());

    }
} 
