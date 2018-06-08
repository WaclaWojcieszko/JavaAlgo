package org.wojcieszko.ballOnTheFence;

import java.util.Arrays;

public class BallOnTheFence {

    private int[] fence;

    public int[] getFence() {
        return fence;
    }

    public void setFence(int[] fence) {
        this.fence = fence;
    }


    public void fallingBall() {

        int[] fenceTemp = fence.clone();

        FenceElement[] fenceElements = new FenceElement[fence.length];
        Arrays.sort(fenceTemp);

        for (int i = 0; i < fenceElements.length; ++i) {
            fenceElements[i] = new FenceElement(i, fence[i]);
        }



//        for (int i = 0; i < fenceElements.length; ++i) {
//            if (fenceElements[i] == fenceTemp)
//            fenceTemp[] = null;
//        }
//
    }

}
