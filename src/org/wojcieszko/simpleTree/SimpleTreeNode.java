package org.wojcieszko.simpleTree;

public class SimpleTreeNode {
    int data;
    SimpleTreeNode left;
    SimpleTreeNode right;

    public SimpleTreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public boolean hasLeft(){
        return left != null;
    }
    public boolean hasRight(){
        return right != null;
    }

    public int getData() {
        return data;
    }

    public SimpleTreeNode getLeft() {
        return left;
    }

    public SimpleTreeNode getRight() {
        return right;
    }


}
