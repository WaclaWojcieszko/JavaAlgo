package org.wojcieszko.nwd;

public class NWD {

    private int a;
    private int b;

    public NWD(int a, int b) {
        this.a = a;
        this.b = b;
    }


    public int getNWD() {
        int c = 1;

        while (c != 0) {
            c = a % b;
            a = b;
            b = c;
        }

        return a;

    }


}
