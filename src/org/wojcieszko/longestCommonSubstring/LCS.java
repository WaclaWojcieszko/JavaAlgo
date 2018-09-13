package org.wojcieszko.longestCommonSubstring;

import java.util.Arrays;

public class LCS {

    private char[] xArr;
    private char[] yArr;

    public LCS(String x, String y) {

        this.xArr = x.toCharArray();
        this.yArr = y.toCharArray();

    }

    public void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; ++i) {
            System.out.println(Arrays.toString(matrix[i]));

        }
        System.out.println();

    }

    public String findLCS() {

        int[] maxXY = new int[3];

        int[][] matrixLCS = new int[xArr.length + 1][yArr.length + 1];


        printMatrix(matrixLCS);


        for (int indexX = 1; indexX <= xArr.length; ++indexX) {
            for (int indexY = 1; indexY <= yArr.length; ++indexY) {

                if (xArr[indexX - 1] == yArr[indexY - 1]) {
                    matrixLCS[indexX][indexY] = matrixLCS[indexX - 1][indexY - 1] + 1;

                    if (matrixLCS[indexX][indexY] > maxXY[0]) {
                        maxXY[0] = matrixLCS[indexX][indexY];
                        maxXY[1] = indexX;
                        maxXY[2] = indexY;
                    }
                }

            }
        }


        printMatrix(matrixLCS);

        String substr = "";

        for (int stringL = 1; stringL <= maxXY[0]; ++stringL) {

            substr = xArr[maxXY[1] - stringL] + substr;

        }

        return substr;
    }
}
