package org.wojcieszko.chess;

public class FigurePosition {

    public int[] position = {};

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }

    public void changePosition(int[] moveFigure) {
        this.position[0] += moveFigure[0];
        this.position[1] += moveFigure[1];
    }

}
