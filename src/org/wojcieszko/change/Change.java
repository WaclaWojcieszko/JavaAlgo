package org.wojcieszko.change;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Change {

    public void changeMoney(List<Integer> moneyLeft, int searched, List<List<Integer>> results, List<Integer> moneyChecked) {


//        System.out.println(moneyLeft.toString()+  " " + searched + " " + moneyChecked.toString());

        int lastCoin = 0;

        for (Integer coin : moneyLeft) {
            if (lastCoin == coin) {
                continue;
            } else {
                lastCoin = coin;
            }

            List<Integer> moneyLeftCopy = new ArrayList<>(moneyLeft);
            List<Integer> moneyCheckedCopy = new ArrayList<>(moneyChecked);
            int searchedCopy = searched;

            if (searched < 0) {
                return;
            }
            if (moneyLeftCopy.isEmpty()) {
                return;
            }
            if (searched == 0) {
                results.add(moneyCheckedCopy);
                return;
            } else if (searched > 0) {
                moneyCheckedCopy.add(coin);
                searchedCopy -= coin;
                moneyLeftCopy.remove(coin);
                changeMoney(moneyLeftCopy, searchedCopy, results, moneyCheckedCopy);
            }
        }
    }

    public void printList(List<List<Integer>> list) {
        for (List sublist : list) {
            System.out.println(sublist.toString());
        }
    }

    public int[][] gimmeMyMoney(List<Integer> money, int searched) {

        List<List<Integer>> results = new ArrayList<>();
        List<Integer> moneyChecked = new ArrayList<>();
        Collections.sort(money);

        changeMoney(money, searched, results, moneyChecked);
        printList(results);

        return null;
    }

}
