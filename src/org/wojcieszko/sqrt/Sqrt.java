package org.wojcieszko.sqrt;

public class Sqrt {

    public static int pow3(int number) {
        System.out.print(number + " ");
        return number * number * number;

    }

    public static int sqrt3(int number) {
        int sqrt = -1;
        int compare = 1;
        int minCompare = 0;
        int searched = 0;
        int change = 1;
        int powerCompare = pow3(compare);

        while (powerCompare <= number) {

            minCompare = compare;
            compare = compare * 2;
            powerCompare = pow3(compare);
            if (number == powerCompare) {
                return compare;
            }
        }

        while (true) {
            change = compare - minCompare;
            searched = minCompare + (compare - minCompare) / 2;

            if (pow3(searched) == number) {
                return searched;
            } else if (pow3(searched) > number) {
                compare = searched;
            } else if (pow3(searched) < number) {
                minCompare = searched;
            }

            if (change <= 1) {
                break;
            }

        }


        return sqrt;

    }


}
