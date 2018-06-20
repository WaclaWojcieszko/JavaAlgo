package org.wojcieszko.ballOnTheFence;

public class FenceElement implements Comparable<FenceElement> {

    private int x;
    private int y;
    private int value;
    private int steps = 0;


    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public void addSteps(int steps) {
        this.steps += steps;
    }


    public FenceElement(int x, int y, int value) {
        this.x = x;
        this.y = y;
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

    @Override
    public int compareTo(FenceElement fenceElement) {
        if (fenceElement.getValue() > this.getValue()){
            return -1;
        } else if (fenceElement.getValue() < this.getValue()){
            return 1;
        } else return 0;
    }
}
