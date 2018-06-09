package org.wojcieszko.tree;

public class MyTreeNode<Integer> {

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

    public MyTreeNode getRoot() {
        return root;
    }

    public void setRoot (MyTreeNode root) {
        this.root = root;
    }

}
