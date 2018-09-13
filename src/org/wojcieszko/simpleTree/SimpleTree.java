package org.wojcieszko.simpleTree;

public class SimpleTree {


    SimpleTreeNode root;

    public SimpleTreeNode getRoot() {
        return root;
    }

    public void append(SimpleTreeNode node) {


        SimpleTreeNode actual = root;

        if (this.root == null) {
            this.root = node;
        } else while (true){
            if (actual.data > node.data) {
                if (actual.hasLeft()){
                    actual = actual.left;
                } else {
                    actual.left = node;
                    break;
                }
            } else {
                if(actual.hasRight()){
                    actual = actual.right;
                } else {
                    actual.right = node;
                    break;
                }
            }
        }
    }

    public SimpleTreeNode getCloseParent(SimpleTreeNode a, SimpleTreeNode b){
        SimpleTreeNode parent = null;
        SimpleTreeNode actual = root;

        while (true){
            if (actual.getData() >= a.getData() && actual.getData() >= b.getData()){
                parent = actual;
                actual = actual.getLeft();
            } else if (actual.getData() <= a.getData() && actual.getData() <= b.getData()){
                parent = actual;
                actual = actual.getRight();
            } else {
                parent = actual;
                break;
            }
            if (actual == null){
                break;
            }
        }

        return parent;

    }

}
