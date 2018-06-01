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

    public void viewAnalysis(){
        blockView = blockHeight.clone();

        for (int i = blockHeight.length - 1; i > 0; --i){

            if (blockHeight[i - 1] > blockHeight[i]){
                blockView[i - 1] = blockHeight[i] + 1;
            } else if (blockHeight[i - 1] <= blockHeight[i]){
                blockView[i - 1] = 0;
            }
        }

        System.out.print(Arrays.toString(blockView));

    }

}
