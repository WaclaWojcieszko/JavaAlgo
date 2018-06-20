package org.wojcieszko.ballOnTheFence;

import java.util.Arrays;

public class BallOnTheFence {

    private int[][] fence;
    public int x;
    public int y;

    public BallOnTheFence(int[][] fence) {
        this.fence = fence;
        x = fence.length;
        y = fence[0].length;
    }

    public int[][] getFence() {
        return fence;

    }

    public void setFence(int[][] fence) {
        this.fence = fence;
        x = fence.length;
        y = fence[0].length;
    }

    public void sortFence() {

        FenceElement[] fenceElements = new FenceElement[x * y];

        for (int cY = 0; cY < y; ++cY) {
            for (int x = 0; x < fenceElements.length; ++x) {
                fenceElements[x * (cY + 1)] = new FenceElement(x, cY, fence[x][cY]);

            }
        }
        Arrays.sort(fenceElements);

        for (FenceElement item : fenceElements) {

            System.out.println(item.getValue());

        }

    }


    public void fallingBall() {


        FenceElement[][] classFence = new FenceElement[x][y];
        FenceElement[] fenceElements = new FenceElement[x * y];
        int idx = 0;
        for (int cY = 0; cY < y; ++cY) {
            for (int cX = 0; cX < x; ++cX) {
                fenceElements[idx] = new FenceElement(cX, cY, fence[cX][cY]);
                classFence[cX][cY] = fenceElements[idx];
                ++idx;
            }
        }
        Arrays.sort(fenceElements);


        for (int i = 0; i < fenceElements.length; ++i) {
            int tmpSteps = 0;

            if ((fenceElements[i].getX() - 1 >= 0) && (fence[fenceElements[i].getX()][fenceElements[i].getY()] > fence[fenceElements[i].getX() - 1][fenceElements[i].getY()])) {
                tmpSteps = classFence[fenceElements[i].getX() - 1][fenceElements[i].getY()].getSteps() + 1;
            }

            if ((fenceElements[i].getX() + 1 < x) && (fence[fenceElements[i].getX()][fenceElements[i].getY()] > fence[fenceElements[i].getX() + 1][fenceElements[i].getY()])) {
                if ((classFence[fenceElements[i].getX() + 1][fenceElements[i].getY()].getSteps() + 1) > tmpSteps) {
                    tmpSteps = (classFence[fenceElements[i].getX() + 1][fenceElements[i].getY()].getSteps() + 1);
                }
            }

            if ((fenceElements[i].getY() - 1 >= 0) && (fence[fenceElements[i].getX()][fenceElements[i].getY()] > fence[fenceElements[i].getX()][fenceElements[i].getY() - 1])) {
                if ((classFence[fenceElements[i].getX()][fenceElements[i].getY() - 1].getSteps() + 1) > tmpSteps) {
                    tmpSteps = (classFence[fenceElements[i].getX()][fenceElements[i].getY() - 1].getSteps() + 1);
                }
            }

            if ((fenceElements[i].getY() + 1 < y) && (fence[fenceElements[i].getX()][fenceElements[i].getY()] > fence[fenceElements[i].getX()][fenceElements[i].getY() + 1])) {
                if ((classFence[fenceElements[i].getX()][fenceElements[i].getY() + 1].getSteps() + 1) > tmpSteps) {
                    tmpSteps = (classFence[fenceElements[i].getX()][fenceElements[i].getY() + 1].getSteps() + 1);
                }
            }


            fenceElements[i].addSteps(tmpSteps);
        }


        for (int ln = 0; ln < classFence.length; ++ln) {
            for (int col = 0; col < classFence[0].length; ++col) {
                System.out.print(classFence[ln][col].getSteps() + " ");
            }
            System.out.println();

        }
    }


}
