package org.wojcieszko.ballOnTheFence;

public class FenceElement {

    private int x;
    private int value;

    public FenceElement(int x, int value) {
        this.x = x;
        this.value = value;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
