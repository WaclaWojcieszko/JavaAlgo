package org.wojcieszko;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BSearch {


    public List<Integer> getData() {
        return data;
    }

    public void setData(List<Integer> data) {
        this.data = data;
    }

    public List<Integer> data;

    public BSearch(List<Integer> data) {
        this.data = data;
        data = new ArrayList<>();
    }

    public void bSearch() {
        return;
    }

    public void fill() {
        for (int i = 0; i < 10; ++i) {
            data.add((int) (Math.random() * 1000));
        }
        Collections.sort(data);
    }

    public int find(int t) {
        int maxPosition = data.size();
        int minPosition = 0;


        while (true) {
            int position = minPosition + (maxPosition - minPosition) / 2;
            int diff = (maxPosition - minPosition) / 2;

            System.out.print("Begin: " + minPosition);
            System.out.print(" End: " + maxPosition);
            System.out.println(" Actual: " + position);


            if (t == data.get(position)) {
                return position;
            } else if (t < data.get(position)) {
                maxPosition = position;
            } else if (t > data.get(position)) {
                minPosition = position;
            }
            if (diff == 0) {
                return -1;
            }

        }
    }

}
