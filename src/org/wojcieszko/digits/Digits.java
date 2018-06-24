package org.wojcieszko.digits;

public class Digits {
    public static int nDigits(int number) {
        int counter = 0;
        while (number >= 1) {
            number /= 10;
            ++counter;
        }
        return counter;
    }

    public static int nDigitsLog(int number) {
        return (int) Math.log10(number);
    }

    public static int nDigitsMultiply(int number) {
        int counter = 0;
        int multiplied = 1;
        while (number >= multiplied) {
            multiplied *= 10;
            ++counter;
        }
        return counter;
    }

    public static int nDigitsArray(int number, int[] array) {
        int counter = 0;
        while (number >= array[counter]) {
            ++counter;
        }
        return counter;
    }

}
