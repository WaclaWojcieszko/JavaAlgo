package org.wojcieszko.calculator;

import java.util.Stack;

public class RPNCalculator {

    private Stack<Double> digits = new Stack<>();

    public void operate(String operationInput) {

        String[] operation = operationInput.split(" ");

        for (String element : operation) {

            System.out.println(digits.toString());

            System.out.print(" " + element);

            if (element.matches("-?\\d*\\.*\\d*") && !element.equals("-")) {
                digits.push(Double.parseDouble(element));
//                System.out.println(digits.peek());
            } else {

                RPNOperator op = RPNOperator.getOp(element);

                if (op == RPNOperator.EQUALS) {
                    System.out.println(digits.peek());
                } else {
                    digits.push(RPNOperator.calculate(digits.pop(), digits.pop(), op));
                }

            }

        }

    }
}
