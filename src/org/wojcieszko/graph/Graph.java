package org.wojcieszko.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Graph {

    enum color {
        WHITE, GRAY, BLACK
    }

    public class Node {
        int value;

        public Node(int value) {
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
    public List<ArrayList<Boolean>> neighbours;

    public Graph(int nodeCount) {
        this.nodes = new ArrayList<Node>();
        for (int index = 0; index < nodeCount; ++index) {
            nodes.add(new Node(index));
        }

        this.neighbours = new ArrayList<ArrayList<Boolean>>(nodeCount);

        for (int outerIndex = 0; outerIndex < nodeCount; ++outerIndex) {
            neighbours.add(outerIndex, new ArrayList<>());
            for (int innerList = 0; innerList < nodeCount; ++innerList) {
                neighbours.get(outerIndex).add(innerList, false);
            }
        }

    }

    public void setNeighbours(int nodeIndex, int neighbourIndex) {
        neighbours.get(nodeIndex).set(neighbourIndex, true);
    }

    public void setValue(int nodeIndex, int value) {
        nodes.get(nodeIndex).setValue(value);
    }

    public boolean findPath(int indexFrom, int indexTo) {


        Queue<Integer> neighboursQueue = new PriorityQueue<>();
        List<color> colors = new ArrayList<>(neighbours.size());

        for (int edgeIndex = 0; edgeIndex < neighbours.size(); ++edgeIndex) {
            colors.add(color.WHITE);
        }


        neighboursQueue.add(indexFrom);

        colors.set(indexFrom, color.GRAY);

        while (!neighboursQueue.isEmpty()) {
            int polledValue = neighboursQueue.poll();
            if (polledValue == indexTo) {
                return true;
            }


            for (int index = 0; index < neighbours.get(polledValue).size(); ++index) {
                if (neighbours.get(polledValue).get(index) && colors.get(index) == color.WHITE) {
                    neighboursQueue.add(index);
                    colors.set(index, color.GRAY);
                }
            }
            colors.set(polledValue, color.BLACK);
        }

        return false;

    }


}
