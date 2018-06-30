package org.wojcieszko.eratostenes;

public class Eratostenes {

    public boolean[] sito;

    public void create(int n) {
        this.sito = new boolean[n];

        for (int i = 0; i < sito.length; ++i) {
            this.sito[i] = true;
        }

        sito[0] = false;
        sito[1] = false;

        for (int i = 2; i < n; ++i) {
            if (sito[i]) {
                for (int j = 2 * i; j < n; j += i) {
                    sito[j] = false;

                }

            }

        }


    }

    public void expand(boolean[] shortSito, int n) {
        this.sito = new boolean[n];

        for (int i = shortSito.length; i < n; ++i) {
            sito[i] = true;
        }

        for (int i = 0; i < n; ++i) {
            if (i < shortSito.length) {
                sito[i] = shortSito[i];
                if (sito[i]) {
                    for (int j = shortSito.length / i * i; j < n; j += i) {
                        if (j >= shortSito.length) {
                            sito[j] = false;
                        }
                    }
                }
            }
        }

    }

    public void print() {
        System.out.println();
        for (int i = 0; i < sito.length; ++i) {
            if (sito[i]) {
                System.out.print(i + ", ");
            }
        }

    }
}
