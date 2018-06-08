package org.wojcieszko.tree;

public class MyTree<Integer> {
    public MyTreeNode<Integer> root;

    public MyTree(Integer data) {
        root = new MyTreeNode<>(data);
        root.leftLeaf = null;
        root.rightLeaf = null;

    }

    public static class MyTreeNode<Integer> {

        private MyTreeNode root;
        private Integer data;

        private MyTreeNode leftLeaf;
        private MyTreeNode rightLeaf;

        public MyTreeNode(Integer data) {
            this.data = data;
        }


        public Integer getData() {
            return data;
        }

        public void setData(Integer data) {
            this.data = data;
        }

        public MyTreeNode getLeftLeaf() {
            return leftLeaf;
        }

        public void setLeftLeaf(MyTreeNode leftLeaf) {
            this.leftLeaf = leftLeaf;
        }

        public MyTreeNode getRightLeaf() {
            return rightLeaf;
        }

        public void setRightLeaf(MyTreeNode rightLeaf) {
            this.rightLeaf = rightLeaf;
        }

        public MyTreeNode getHead() {
            return root;
        }

        public void setHead(MyTreeNode root) {
            this.root = root;
        }

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

        if ((int)first.getData() > (int)second.getData()){
            return Compare.BIGGER;
        }  else if ((int)first.getData() == (int)second.getData()){
            return Compare.EQUAL;
        } else if ((int)first.getData() < (int)second.getData()) {
            return Compare.SMALLER;
        } else return null;

    }



    public void appendLeaf (MyTreeNode myLeaf) throws Exception {

        if (myLeaf.getHead() == null){
            myLeaf.setHead(root);
        }
        if (compareDataValue(myLeaf.getHead(), myLeaf) == Compare.BIGGER) {
            if (myLeaf.getHead().getLeftLeaf() == null) {
                myLeaf.getHead().setLeftLeaf(myLeaf);
                myLeaf.setHead(myLeaf.getHead());
            } else {
                myLeaf.setHead(myLeaf.getHead().getLeftLeaf());
                appendLeaf(myLeaf);

            }
        } else if (compareDataValue(myLeaf.getHead(), myLeaf) == Compare.SMALLER) {
            if (myLeaf.getHead().getRightLeaf() == null) {
                myLeaf.getHead().setRightLeaf(myLeaf);
                myLeaf.setHead(myLeaf.getHead());
            } else {
                myLeaf.setHead(myLeaf.getHead().getRightLeaf());
                appendLeaf(myLeaf);
            }
        }

    }


}
