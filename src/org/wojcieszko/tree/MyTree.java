package org.wojcieszko.tree;

public class MyTree<Integer> {
    public MyTreeNode<Integer> root;

    public MyTree(Integer data) {
        root = new MyTreeNode<>(data);
        root.setLeftLeaf(null);
        root.setRightLeaf(null);

    }

    public boolean hasLeftLeaf(MyTreeNode myTreeNode) {
        if (myTreeNode.getLeftLeaf() == null) {
            return false;
        } else return true;
    }

    public boolean hasRightLeaf(MyTreeNode myTreeNode) {
        if (myTreeNode.getRightLeaf() == null) {
            return false;
        } else return true;
    }

    public Compare compareDataValue(MyTreeNode first, MyTreeNode second) {

        if ((int) first.getData() > (int) second.getData()) {
            return Compare.BIGGER;
        } else if ((int) first.getData() == (int) second.getData()) {
            return Compare.EQUAL;
        } else if ((int) first.getData() < (int) second.getData()) {
            return Compare.SMALLER;
        } else return null;

    }

    public void appendLeaf(MyTreeNode myLeaf) throws Exception {


        if (myLeaf.getRoot() == null) {
            myLeaf.setRoot(root);
        }
        if (compareDataValue(myLeaf.getRoot(), myLeaf) == Compare.BIGGER) {
            if (!hasLeftLeaf(myLeaf)) {
                myLeaf.getRoot().setLeftLeaf(myLeaf);

            } else {
                myLeaf.setRoot(myLeaf.getRoot().getLeftLeaf());
                appendLeaf(myLeaf);

            }
        } else if (compareDataValue(myLeaf.getRoot(), myLeaf) == Compare.SMALLER) {
            if (!hasRightLeaf(myLeaf)) {
                myLeaf.getRoot().setRightLeaf(myLeaf);
            } else {
                myLeaf.setRoot(myLeaf.getRoot().getRightLeaf());
                appendLeaf(myLeaf);
            }
        }
    }

    public MyTreeNode findLeaf(MyTreeNode myLeaf) {

        MyTreeNode tmpRoot = myLeaf.getRoot();

        if (myLeaf.getRoot() == null) {
            tmpRoot = root;
        }

        if (compareDataValue(tmpRoot, myLeaf) == Compare.EQUAL) {
            return tmpRoot;
        } else if (compareDataValue(tmpRoot, myLeaf) == Compare.SMALLER) {
            myLeaf.setRoot(tmpRoot.getLeftLeaf());
            if (myLeaf.getRoot() == null) {
                return null;
            } else {
                findLeaf(myLeaf);
            }
        } else if (compareDataValue(tmpRoot, myLeaf) == Compare.BIGGER) {
            myLeaf.setRoot(tmpRoot.getRightLeaf());
            if (myLeaf.getRoot() == null) {
                return null;
            } else {
                findLeaf(myLeaf);
            }
        }

        return null;
    }

}
