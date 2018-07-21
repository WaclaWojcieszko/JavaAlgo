package org.wojcieszko.wielomianHorner;

public class MrHorner {

    public float[] getArr() {
        return arr;
    }

    public void setArr(float[] arr) {
        this.arr = arr;
    }

    float[] arr;

    public float calculateMrHorner(float x){
        float value = 0;
        float xX = 1;
        for (float a: arr) {
            value += a * xX;
            xX *= x;
        }
        return value;

    }


}
