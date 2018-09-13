package org.wojcieszko.tree;

public class MyTree<T> {
    public MyTreeNode root;

    public MyTree() {
    }

    private boolean hasLeftLeaf(MyTreeNode myTreeNode) {
        return myTreeNode.getLeftLeaf() != null;
    }

    private boolean hasRightLeaf(MyTreeNode myTreeNode) {
        return myTreeNode.getRightLeaf() != null;
    }

    private Compare compareDataValue(MyTreeNode first, MyTreeNode second) {

        if ((int) first.getData() < (int) second.getData()) {
            return Compare.BIGGER;
        } else if ((int) first.getData() == (int) second.getData()) {
            return Compare.EQUAL;
        } else if ((int) first.getData() > (int) second.getData()) {
            return Compare.SMALLER;
        } else return null;

    }


    public void appendLeaf(MyTreeNode tmpParent, MyTreeNode myLeaf) {

        if (this.root == null) {
            this.root = myLeaf;
        } else {

            if (tmpParent == null) {
                tmpParent = this.root;
            }

            myLeaf.setParent(tmpParent);

            if (compareDataValue(tmpParent, myLeaf) == Compare.SMALLER) {
                if (!hasLeftLeaf(myLeaf.getParent())) {
                    myLeaf.getParent().setLeftLeaf(myLeaf);

                } else {
                    appendLeaf(myLeaf.getParent().getLeftLeaf(), myLeaf);
                }

            } else if (compareDataValue(tmpParent, myLeaf) == Compare.BIGGER) {
                if (!hasRightLeaf(myLeaf.getParent())) {
                    myLeaf.getParent().setRightLeaf(myLeaf);
                } else {
                    appendLeaf(myLeaf.getParent().getRightLeaf(), myLeaf);
                }
            }
        }
    }

    public MyTreeNode findLeaf(MyTreeNode myLeaf) {

        if (myLeaf.getParent() == null) {
            myLeaf.setParent(this.root);
        }

        if (compareDataValue(myLeaf.getParent(), myLeaf) == Compare.EQUAL) {
            return myLeaf.getParent();
        } else if (compareDataValue(myLeaf.getParent(), myLeaf) == Compare.SMALLER) {
            if (myLeaf.getParent().getLeftLeaf() != null) {

                myLeaf.setParent(myLeaf.getParent().getLeftLeaf());
                findLeaf(myLeaf);
            }
        } else if (compareDataValue(myLeaf.getParent(), myLeaf) == Compare.BIGGER) {
            if (myLeaf.getParent().getRightLeaf() != null) {

                myLeaf.setParent(myLeaf.getParent().getRightLeaf());
                findLeaf(myLeaf);
            }
        } else return null;

        return findLeaf(myLeaf);
    }


    public void deleteNode(MyTreeNode myLeaf) {

        if (compareDataValue(root, myLeaf) == Compare.EQUAL) {
            if (hasLeftLeaf(root)) {

                root.getLeftLeaf().setParent(null);
                appendLeaf(root.getLeftLeaf(), root.getRightLeaf());
                root = root.getLeftLeaf();

            } else if (hasRightLeaf(root)) {

                root.getRightLeaf().setParent(null);
                appendLeaf(root.getRightLeaf(), root.getLeftLeaf());
                root = root.getRightLeaf();

            } else {
                root = null;
            }

        } else if (compareDataValue(myLeaf.getParent(), myLeaf) == Compare.BIGGER) {

            myLeaf.getParent().setRightLeaf(null);

            if (hasRightLeaf(myLeaf)) {
                myLeaf.getRightLeaf().setParent(null);
                appendLeaf(root, myLeaf.getRightLeaf());
            }
            if (hasLeftLeaf(myLeaf)) {
                myLeaf.getLeftLeaf().setParent(null);
                appendLeaf(root, myLeaf.getLeftLeaf());
            }


        } else if (compareDataValue(myLeaf.getParent(), myLeaf) == Compare.SMALLER) {

            myLeaf.getParent().setLeftLeaf(null);

            if (hasRightLeaf(myLeaf)) {
                myLeaf.getRightLeaf().setParent(null);
                appendLeaf(root, myLeaf.getRightLeaf());
            }
            if (hasRightLeaf(myLeaf)) {
                myLeaf.getLeftLeaf().setParent(null);
                appendLeaf(root, myLeaf.getLeftLeaf());
            }

        }
    }


}
