package org.wojcieszko.binaryCombinations;

public class BinaryCombinations {


//TODO przystosować do wydawania reszty

    public void fun3(int... data) {

        int combinations = data.length * data.length;

        for (int counter = 0; counter < combinations; ++counter) {
            int temp = counter;
            int[] z = new int[data.length];

            for (int index = 0; index < data.length; ++index) {
                z[index] = temp % 2;
                temp = temp / 2;
            }

            int value = 0;
            for (int index = 0; index < data.length; ++index) {
                value += z[index] * data[index];
            }
            System.out.println(value);


        }

    }

    public void fun4(int[] data){

        int combinations = 0;

        for (int element : data){
            combinations += element;
        }

        combinations *= combinations;




    }

}
