package org.wojcieszko.tree;

public class MyTreeNode<T extends Comparable <T>> {

    private MyTreeNode parent;
    private T data;

    private MyTreeNode leftLeaf;
    private MyTreeNode rightLeaf;

    public MyTreeNode(T data) {
        this.data = data;
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
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

    public MyTreeNode getParent() {
        return parent;
    }

    public void setParent(MyTreeNode parent) {
        this.parent = parent;
    }

}
