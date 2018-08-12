package org.wojcieszko.dijkstra;

import java.util.*;

public class Dijkstra {

    static class NumberAndCost implements Comparable<NumberAndCost> {

        Integer nodeIndex;
        Float cost;

        public NumberAndCost(Integer nodeIndex, Float cost) {
            this.nodeIndex = nodeIndex;
            this.cost = cost;
        }

        @Override
        public int compareTo(NumberAndCost other) {

            float value = this.cost - other.cost;
            if (value < 0) {
                return -1;
            } else if (value > 0) {
                return 1;
            } else {
                return 0;
            }

        }
    }


    enum color {
        WHITE, GRAY, BLACK
    }

    public class Node {
        int value;

        public Node(Integer value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }


    public List<Node> nodes;
    public List<ArrayList<Integer>> neighbours;

    int nodeCount;

    public Dijkstra(int nodeCount) {
        this.nodes = new ArrayList<Node>();
        for (int index = 0; index < nodeCount; ++index) {
            nodes.add(new Node(index));
        }

        this.neighbours = new ArrayList<ArrayList<Integer>>(nodeCount);
        this.nodeCount = nodeCount;
        for (int outerIndex = 0; outerIndex < nodeCount; ++outerIndex) {
            neighbours.add(outerIndex, new ArrayList<>());
            for (int innerList = 0; innerList < nodeCount; ++innerList) {
                neighbours.get(outerIndex).add(innerList, null);
            }
        }

    }

    public void setNeighbours(int nodeIndex, int neighbourIndex, Integer cost) {
        neighbours.get(nodeIndex).set(neighbourIndex, cost);
    }

//    public void setValue(int nodeIndex, int value) {
//        nodes.get(nodeIndex).setValue(value);
//    }

    public Float findLowestCostPath(int indexFrom, int indexTo) {


        Queue<Dijkstra.NumberAndCost> neighboursQueue = new PriorityQueue<>();
        List<color> colors = new ArrayList<>(nodeCount);
        List<Float> cost = new ArrayList<>(nodeCount);


        for (int edgeIndex = 0; edgeIndex < nodeCount; ++edgeIndex) {
            colors.add(color.WHITE);
            cost.add(1000000.f);
        }


        neighboursQueue.add(new Dijkstra.NumberAndCost(indexFrom, 0f));
        cost.set(indexFrom, 0f);
        colors.set(indexFrom, color.BLACK);

        while (!neighboursQueue.isEmpty()) {
            Dijkstra.NumberAndCost currentNodeAndCost = neighboursQueue.poll();

            Float currentPrice = currentNodeAndCost.cost;
            Integer currentNode = currentNodeAndCost.nodeIndex;

            if (currentNodeAndCost.nodeIndex == indexTo) {
                return currentNodeAndCost.cost;
            }


            for (int index = 0; index < nodeCount; ++index) {

                if (neighbours.get(currentNode).get(index) == null) {
                    continue;
                }
                if (colors.get(index) == color.BLACK) {
                    continue;
                }

                Float currentCost = currentPrice + neighbours.get(currentNode).get(index);

                if (currentCost >= cost.get(index)) {
                    continue;
                }

                cost.set(index, currentCost);
                neighboursQueue.add(new Dijkstra.NumberAndCost(index, currentCost));

            }

            colors.set(currentNode, color.BLACK);


        }

        return 15000.f;

    }
}