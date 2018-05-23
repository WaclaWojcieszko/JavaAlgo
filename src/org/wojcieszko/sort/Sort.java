package org.wojcieszko.sort;

import java.util.Random;

public class Sort {

    int n = 20;
    public int[] table = new int[n];

    public void random01() {
        for (int i = 0; i < n; ++i) {
            table[i] = (int) (Math.random() * 50 + 1);
        }
    }

    public void random02(){
    Random rand = new Random();
        for (int i = 0; i < n; ++i) {
            int randomNo = rand.nextInt(100);
            table[i] = randomNo;
        }
    }


    public void bubbleSort() {

        for (int i = 0; i < n - 1; ++i) {
            for (int j = 0; j < n - 1 - i; ++j) {
                if (table[j] > table[j + 1]) {
                    int tmp = table[j + 1];
                    table[j + 1] = table[j];
                    table[j] = tmp;
                }
            }
        }
    }

}
