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

        MyTree<Integer> myTree = new MyTree();


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
        MyTree myTree = new MyTree();
        MyTreeNode myTreeNodeRoot = new MyTreeNode(12);
        myTree.appendLeaf(myTree.root, myTreeNodeRoot);

        MyTreeNode myTreeNode = new MyTreeNode(3);


        myTree.appendLeaf(myTree.root, myTreeNode);

        Assert.assertEquals(myTreeNode, myTree.root.getLeftLeaf());
        Assert.assertTrue(myTree.root.getLeftLeaf().getData().equals(3));
    }

    @Test

    public void testAppend02() throws Exception {
        MyTree myTree = new MyTree();
        MyTreeNode myTreeNodeRoot = new MyTreeNode(12);
        myTree.appendLeaf(myTree.root, myTreeNodeRoot);

        MyTreeNode myTreeNode1 = new MyTreeNode(30);
        MyTreeNode myTreeNode2 = new MyTreeNode(3);
        MyTreeNode myTreeNode3 = new MyTreeNode(5);
        MyTreeNode myTreeNode4 = new MyTreeNode(1);

        myTree.appendLeaf(myTree.root, myTreeNode1);
        myTree.appendLeaf(myTree.root, myTreeNode2);
        myTree.appendLeaf(myTree.root, myTreeNode3);
        myTree.appendLeaf(myTree.root, myTreeNode4);

        Assert.assertEquals(myTreeNode1, myTree.root.getRightLeaf());
        Assert.assertEquals(myTreeNode1.getParent().getData(), myTree.root.getData());
        Assert.assertTrue(myTree.root.getRightLeaf().getData().equals(30));
        Assert.assertTrue( myTree.root.getLeftLeaf().getData().equals(3));
        Assert.assertTrue(myTree.root.getLeftLeaf().getRightLeaf().getData().equals(5));
        Assert.assertTrue( myTree.root.getLeftLeaf().getLeftLeaf().getData().equals(1));

    }

    @Test
    public void testfind() throws Exception {
        MyTree myTree = new MyTree();
        MyTreeNode myTreeNodeRoot = new MyTreeNode(12);
        myTree.appendLeaf(myTree.root, myTreeNodeRoot);

        MyTreeNode myTreeNode1 = new MyTreeNode(30);
        MyTreeNode myTreeNode2 = new MyTreeNode(3);
        MyTreeNode myTreeNode3 = new MyTreeNode(5);

        myTree.appendLeaf(myTree.root, myTreeNode1);
        myTree.appendLeaf(myTree.root, myTreeNode2);
        myTree.appendLeaf(myTree.root, myTreeNode3);



        Assert.assertEquals(myTree.root.getRightLeaf().getData(), myTree.findLeaf(myTreeNode1).getData());
        Assert.assertEquals(myTree.root.getLeftLeaf().getData(), myTree.findLeaf(myTreeNode2).getData());
        Assert.assertEquals(myTree.root.getLeftLeaf().getRightLeaf().getData(), myTree.findLeaf(myTreeNode3).getData());

    }

    @Test
    public void testDelete() throws Exception {
        MyTree myTree = new MyTree();
        MyTreeNode myTreeNodeRoot = new MyTreeNode(12);
        myTree.appendLeaf(myTree.root, myTreeNodeRoot);

        MyTreeNode myTreeNode1 = new MyTreeNode(30);
        MyTreeNode myTreeNode2 = new MyTreeNode(3);
        MyTreeNode myTreeNode3 = new MyTreeNode(5);
        MyTreeNode myTreeNode4 = new MyTreeNode(1);

        myTree.appendLeaf(myTree.root, myTreeNode1);
        myTree.appendLeaf(myTree.root, myTreeNode2);
        myTree.appendLeaf(myTree.root, myTreeNode3);
        myTree.appendLeaf(myTree.root, myTreeNode4);

        MyTreeNode myTreeNodeX = new MyTreeNode(12);

        myTree.deleteNode(myTreeNode2);
        myTree.deleteNode(myTreeNode2);


        Assert.assertEquals(myTreeNode1.getData(), myTree.root.getRightLeaf().getData());
        Assert.assertEquals(myTreeNode3.getData(), myTree.root.getLeftLeaf().getData());
        Assert.assertEquals(myTreeNode4, myTree.root.getLeftLeaf().getLeftLeaf());

    }
} 
