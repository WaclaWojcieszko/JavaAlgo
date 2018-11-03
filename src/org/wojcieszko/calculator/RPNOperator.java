package org.wojcieszko.calculator;

public enum RPNOperator {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/"),
    POWER("^"),
    EQUALS("=");

    String getSymbol() {
        return symbol;
    }

    static Double calculate(Double a, Double b, RPNOperator RPNOperator) {

        if (RPNOperator.equals(PLUS)) {
            return a + b;
        }
        if (RPNOperator.equals(MINUS)) {
            return b - a;
        }
        if (RPNOperator.equals(MULTIPLY)) {
            return a * b;
        }
        if (RPNOperator.equals(DIVIDE)) {
            return b / a;
        }
        if (RPNOperator.equals(POWER)) {
            return Math.pow(b, a);
        }

        return null;
    }


    static RPNOperator getOp(String sign) {


        for (RPNOperator o : RPNOperator.values()) {

            if (o.symbol.equals(sign)) {
                return o;
            }

//            if (sign.equals(RPNOperator.PLUS.getSymbol())) {
//                return RPNOperator.PLUS;
//            }
//            if (sign.equals(RPNOperator.MINUS.getSymbol())) {
//                return RPNOperator.MINUS;
//            }
//            if (sign.equals(RPNOperator.MULTIPLY.getSymbol())) {
//                return RPNOperator.MULTIPLY;
//            }
//            if (sign.equals(RPNOperator.DIVIDE.getSymbol())) {
//                return RPNOperator.DIVIDE;
//            }
//            if (sign.equals(RPNOperator.POWER.getSymbol())) {
//                return RPNOperator.POWER;
//            }
//            if (sign.equals(RPNOperator.EQUALS.getSymbol())) {
//                return RPNOperator.EQUALS;
//            }
        }
        return null;
    }


    private final String symbol;

    RPNOperator(String symbol) {
        this.symbol = symbol;
    }

}
