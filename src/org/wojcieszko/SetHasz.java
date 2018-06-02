package org.wojcieszko;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SetHasz<T> {

    public ArrayList<List<T>> topList;

    public void setSize(int size) {
        this.size = size;
    }

    int size = 8;

    public SetHasz() {
        topList = new ArrayList<>(size);

        for (int i = 0; i < size; ++i) {
            List<T> insideList = new LinkedList<T>();
            topList.add(i, insideList);
        }

    }

    public void add(T data) {
        int index = data.hashCode() & size - 1;
        List<T> hList = topList.get(index);
        if (!hList.contains(data)) {
            topList.get(index).add(data);
        }
    }

    public boolean find(T data) {
        int index = data.hashCode() & size - 1;
        return topList.get(index).contains(data);

    }

//    public void optimize() {
//        int newSize = size;
//        for (int i = 0; i < topList.size(); ++i) {
//            int tmpSize = topList.get(i).size();
//            if (tmpSize > newSize * 4) {
//                newSize = tmpSize / 4;
//            }
//        }
//        ArrayList<List<T>> tmpList = new ArrayList<>(newSize);
//
//        for (int i = 0; i < size; ++i) {
//
//            List<T> hList = topList.get(i);
//
//        }
//
//    }

}
