package org.wojcieszko.chess;

public class Tower {


    private final int[][] towerDirections = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    private FigurePosition figurePosition = new FigurePosition();

    public int[][] getTowerDirections() {
        return towerDirections;
    }

    public int[] getFigurePosition() {
        return figurePosition.getPosition();
    }

    public void setFigurePosition(int[] position) {
        this.figurePosition.setPosition(position);
    }


}
