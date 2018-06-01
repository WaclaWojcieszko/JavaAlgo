package org.wojcieszko.blockhaus;

import java.util.Arrays;

public class BlockHaus {

    private int[] blockHeight;
    private int[] blockView;

    public int[] getBlockHeight() {
        return blockHeight;
    }

    public void setBlockHeight(int[] blockHeight) {
        this.blockHeight = blockHeight;
    }

    public void viewAnalysis() {

        blockView = blockHeight.clone();
        int highest = blockHeight[blockHeight.length - 1];

        blockView[blockHeight.length - 1] = 1;

        for (int i = blockHeight.length - 1; i > 0; --i) {

            if (blockHeight[i - 1] > highest) {
                blockView[i - 1] = highest + 1;
                highest = blockView[i - 1];
            } else if (blockHeight[i - 1] <= highest) {
                blockView[i - 1] = 0;
            }
        }

        System.out.print(Arrays.toString(blockView));

    }

}
