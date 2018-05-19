package org.wojcieszko.chess;

import java.util.ArrayList;

public class Chess {

    public ArrayList<int[]> arrayList = new ArrayList<>();

    public void towerMoves(int[] position) {

        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        int[] currentPosition = position.clone();

        for (int[] item : directions) {

            currentPosition = position.clone();

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
