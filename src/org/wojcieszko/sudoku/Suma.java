package org.wojcieszko.sudoku;

public class Suma {


    public int sum(int a, int b) {

        if (a == b) {
            return b;
        } else return a + sum(a + 1, b);

    }

    public int sum2(int a, int b) {

        return (a == b ? b : a + sum2(a + 1, b));

    }

    public int sum3(int a, int b) {

        return (a == (a + b) / 2 ? a : sum3(a, (a + b) / 2)) + ((a + b) / 2 + 1 == b ? b : sum3((a + b) / 2 + 1, b));

    }

    public int sum4(int a, int b) {

        if (a == b) {
            return b;
        } else return sum4(a, (a + b) / 2) + sum4((a + b) / 2 + 1, b);

    }

}
