package org.wojcieszko.calculator;

public class InfixCalculator {

    private CalculationGraph calculationGraph = new CalculationGraph();

    int tmpLvl = 0;

    public void operate(String operationInput) {

        String[] operation = operationInput.split(" ");

        for (String element : operation) {

            if (element.equals("(")) {
                ++tmpLvl;
                continue;
            }

            if (element.equals(")")) {
                --tmpLvl;
                continue;
            }
            if (element.equals("=")) {


            }


            if (element.matches("-?\\d*\\.*\\d*") && !element.equals("-")) {
                GraphNode node = new GraphNode(tmpLvl, Double.parseDouble(element));
                calculationGraph.add(node);
            } else {
                calculationGraph.setNextOperator(InfixOperator.getOperator(element));
            }

        }

    }

}
