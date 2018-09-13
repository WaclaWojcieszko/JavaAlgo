package test.org.wojcieszko.simpleTree; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.wojcieszko.simpleTree.SimpleTree;
import org.wojcieszko.simpleTree.SimpleTreeNode;

/** 
* SimpleTree Tester. 
* 
* @author <Authors name> 
* @since <pre>lip 15, 2018</pre> 
* @version 1.0 
*/ 
public class SimpleTreeTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: append(SimpleTreeNode node) 
* 
*/ 
@Test
public void testAppend() throws Exception {
    SimpleTree simpleTree = new SimpleTree();
    SimpleTreeNode node01 = new SimpleTreeNode(5);
    SimpleTreeNode node02 = new SimpleTreeNode(1);
    SimpleTreeNode node03 = new SimpleTreeNode(7);
    SimpleTreeNode node04 = new SimpleTreeNode(3);
    SimpleTreeNode node05 = new SimpleTreeNode(2);
    SimpleTreeNode node06 = new SimpleTreeNode(4);
    SimpleTreeNode node07 = new SimpleTreeNode(6);
    SimpleTreeNode node08 = new SimpleTreeNode(8);
    SimpleTreeNode node09 = new SimpleTreeNode(0);

    simpleTree.append(node01);
    simpleTree.append(node02);
    simpleTree.append(node03);
    simpleTree.append(node04);
    simpleTree.append(node05);
    simpleTree.append(node06);
    simpleTree.append(node07);
    simpleTree.append(node08);
    simpleTree.append(node09);

    Assert.assertEquals(node01, simpleTree.getRoot());
    Assert.assertEquals(node09, simpleTree.getRoot().getLeft().getLeft());
    Assert.assertNull(simpleTree.getRoot().getLeft().getLeft().getLeft());
}

    @Test
    public void testAppend01() throws Exception {
        SimpleTree simpleTree = new SimpleTree();
        SimpleTreeNode node01 = new SimpleTreeNode(5);
        SimpleTreeNode node02 = new SimpleTreeNode(1);
        SimpleTreeNode node03 = new SimpleTreeNode(7);
        SimpleTreeNode node04 = new SimpleTreeNode(3);
        SimpleTreeNode node05 = new SimpleTreeNode(2);
        SimpleTreeNode node06 = new SimpleTreeNode(4);
        SimpleTreeNode node07 = new SimpleTreeNode(6);
        SimpleTreeNode node08 = new SimpleTreeNode(8);
        SimpleTreeNode node09 = new SimpleTreeNode(0);

        simpleTree.append(node01);
        simpleTree.append(node02);
        simpleTree.append(node03);
        simpleTree.append(node04);
        simpleTree.append(node05);
        simpleTree.append(node06);
        simpleTree.append(node07);
        simpleTree.append(node08);
        simpleTree.append(node09);

        Assert.assertEquals(node01, simpleTree.getRoot());
        Assert.assertEquals(node09, simpleTree.getRoot().getLeft().getLeft());
        Assert.assertNull(simpleTree.getRoot().getLeft().getLeft().getLeft());

        Assert.assertEquals(node04.getData(), simpleTree.getCloseParent(node05, node06).getData());
    }


} 
