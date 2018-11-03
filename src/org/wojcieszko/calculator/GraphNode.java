package org.wojcieszko.calculator;

public class GraphNode {

    private int level;
    private Double value;

    private GraphNode previousElement;
    private GraphNode nextElement;
    private InfixOperator previousEdge;
    private InfixOperator nextEdge;

    public GraphNode(int level, Double value) {
        this.level = level;
        this.value = value;
    }

    public void add(GraphNode node) {
        if (this.nextElement == null) {
            this.setNextElement(node);
            node.setPreviousElement(this);
            node.setPreviousEdge(this.nextEdge);
        } else {
            this.nextElement.add(node);
        }
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public GraphNode getPreviousElement() {
        return previousElement;
    }

    public void setPreviousElement(GraphNode previousElement) {
        this.previousElement = previousElement;
    }

    public GraphNode getNextElement() {
        return nextElement;
    }

    public void setNextElement(GraphNode nextElement) {
        this.nextElement = nextElement;
    }

    public InfixOperator getPreviousEdge() {
        return previousEdge;
    }

    public void setPreviousEdge(InfixOperator previousEdge) {
        this.previousEdge = previousEdge;
    }

    public InfixOperator getNextEdge() {
        return nextEdge;
    }

    public void setNextEdge(InfixOperator nextEdge) {
        this.nextEdge = nextEdge;
    }
}
