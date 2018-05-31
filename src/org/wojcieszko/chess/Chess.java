package org.wojcieszko.chess;

import java.util.ArrayList;

public class Chess {

    public Tower tower = new Tower();

    public ArrayList<int[]> arrayList = new ArrayList<>();

    public void towerMoves(int[] position) {

        int[] currentPosition;

        for (int[] item : tower.getTowerDirections()) {

            currentPosition = tower.getFigurePosition().clone();

            while (true) {

                currentPosition[0] += item[0];
                currentPosition[1] += item[1];

                if (currentPosition[0] < 0 || currentPosition[0] > 7 || currentPosition[1] < 0 || currentPosition[1] > 7) {
                    break;
                }

                arrayList.add(currentPosition);

            }
        }
    }

}
