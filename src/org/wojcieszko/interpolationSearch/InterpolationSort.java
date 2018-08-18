package org.wojcieszko.interpolationSearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InterpolationSort {

    List<Integer> arrList;


    public InterpolationSort(int size, int max) {
        this.arrList = new ArrayList<>();

        for (int index = 0; index < size; ++index) {
            arrList.set(index, (int) (Math.random() * max));
        }

        Collections.sort(arrList);
    }

    public InterpolationSort(ArrayList<Integer> arrList) {
        this.arrList = arrList;
    }

    public Integer searchValue(int value) {

        int maxIndex = arrList.size() - 1;
        int minIndex = 0;

        if (value > arrList.get(maxIndex) || value < arrList.get(minIndex)) {
            return null;
        }

        if (arrList.get(minIndex) == value) {
            return minIndex;
        }
        if (arrList.get(maxIndex) == value) {
            return maxIndex;
        }

        while (maxIndex - minIndex >= 1) {

            System.out.println("minIndex = " + minIndex);

            System.out.println("maxIndex = " + maxIndex);

            float a = (float) (value - arrList.get(minIndex));
            float b = (float) (arrList.get(maxIndex) - arrList.get(minIndex));
            float c = a / b;

            int diff = (int) Math.floor(c * (maxIndex - minIndex));

            if (diff == 0) {
                if (arrList.get(minIndex + diff) < value) {
                    while (minIndex < maxIndex) {
                        if (arrList.get(minIndex) == value) {
                            return minIndex;
                        }
                        ++minIndex;
                    }
                } else {
                    while (minIndex < maxIndex) {
                        if (arrList.get(maxIndex) == value) {
                            return maxIndex;
                        }
                        --maxIndex;
                    }
                }
            }

            System.out.println("medIndex = " + diff);

            if (arrList.get(minIndex + diff) == value) {
                return minIndex + diff;
            } else if (arrList.get(minIndex + diff) < value) {
                minIndex += diff;
            } else if (arrList.get(minIndex + diff) > value) {
                maxIndex = minIndex + diff;
            }

        }
        return null;

    }


}
