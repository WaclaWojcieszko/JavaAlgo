package org.wojcieszko.calculator;

public class CalculationGraph {

    private GraphNode root;

    private GraphNode lastNode;

    public CalculationGraph() {
        this.root = null;
    }

    public void add(GraphNode node) {
        if (this.root == null) {
            this.root = node;
            this.lastNode = node;
        } else {
            this.root.add(node);
            this.lastNode = node;
        }
    }

    public void setNextOperator(InfixOperator operator) {
        lastNode.setNextEdge(operator);
    }

}
