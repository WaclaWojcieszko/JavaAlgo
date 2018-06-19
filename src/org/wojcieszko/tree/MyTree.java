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

        if ((int) first.getData() < (int) second.getData()) {
            return Compare.BIGGER;
        } else if ((int) first.getData() == (int) second.getData()) {
            return Compare.EQUAL;
        } else if ((int) first.getData() > (int) second.getData()) {
            return Compare.SMALLER;
        } else return null;

    }


    public void appendLeaf(MyTreeNode tmpRoot, MyTreeNode myLeaf) {

        myLeaf.setRoot(tmpRoot);

        if (compareDataValue(tmpRoot, myLeaf) == Compare.SMALLER) {
            if (!hasLeftLeaf(myLeaf.getRoot())) {
                myLeaf.getRoot().setLeftLeaf(myLeaf);

            } else {
                appendLeaf(myLeaf.getRoot().getLeftLeaf(), myLeaf);
            }

        } else if (compareDataValue(tmpRoot, myLeaf) == Compare.BIGGER) {
            if (!hasRightLeaf(myLeaf.getRoot())) {
                myLeaf.getRoot().setRightLeaf(myLeaf);
            } else {
                appendLeaf(myLeaf.getRoot().getRightLeaf(), myLeaf);
            }
        }
    }

    public MyTreeNode findLeaf(MyTreeNode myLeaf) {

        if (myLeaf.getRoot() == null) {
            myLeaf.setRoot(this.root);
        }

        if (compareDataValue(myLeaf.getRoot(), myLeaf) == Compare.EQUAL) {
            return myLeaf.getRoot();
        } else if (compareDataValue(myLeaf.getRoot(), myLeaf) == Compare.SMALLER) {
            if (myLeaf.getRoot().getLeftLeaf() != null) {

                myLeaf.setRoot(myLeaf.getRoot().getLeftLeaf());
                findLeaf(myLeaf);
            }
        } else if (compareDataValue(myLeaf.getRoot(), myLeaf) == Compare.BIGGER) {
            if (myLeaf.getRoot().getRightLeaf() != null) {

                myLeaf.setRoot(myLeaf.getRoot().getRightLeaf());
                findLeaf(myLeaf);
            }
        } else return null;

        return findLeaf(myLeaf);
    }


    public void deleteNode(MyTreeNode myLeaf) {

        if (compareDataValue(root, myLeaf) == Compare.EQUAL) {
            if (hasLeftLeaf(root)) {

                root.getLeftLeaf().setRoot(null);
                appendLeaf(root.getLeftLeaf(), root.getRightLeaf());
                root = root.getLeftLeaf();

            } else if (hasRightLeaf(root)) {

                root.getRightLeaf().setRoot(null);
                appendLeaf(root.getRightLeaf(), root.getLeftLeaf());
                root = root.getRightLeaf();

            } else {
                root = null;
            }

        } else if (compareDataValue(myLeaf.getRoot(), myLeaf) == Compare.BIGGER) {

            myLeaf.getRoot().setRightLeaf(null);

            if (hasRightLeaf(myLeaf)) {
                myLeaf.getRightLeaf().setRoot(null);
                appendLeaf(root, myLeaf.getRightLeaf());
            }
            if (hasLeftLeaf(myLeaf)) {
                myLeaf.getLeftLeaf().setRoot(null);
                appendLeaf(root, myLeaf.getLeftLeaf());
            }


        } else if (compareDataValue(myLeaf.getRoot(), myLeaf) == Compare.SMALLER) {

            myLeaf.getRoot().setLeftLeaf(null);

            if (hasRightLeaf(myLeaf)) {
                myLeaf.getRightLeaf().setRoot(null);
                appendLeaf(root, myLeaf.getRightLeaf());
            }
            if (hasRightLeaf(myLeaf)) {
                myLeaf.getLeftLeaf().setRoot(null);
                appendLeaf(root, myLeaf.getLeftLeaf());
            }

        }
    }

}
