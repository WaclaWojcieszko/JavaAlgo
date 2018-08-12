package org.wojcieszko.calculator;

public enum Operator {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/"),
    POWER("^"),
    EQUALS("=");

    String getSymbol() {
        return symbol;
    }

    static Double calculate(Double a, Double b, Operator operator){

            if (operator.equals(PLUS)) {
                return a + b;
            }
            if (operator.equals(MINUS)) {
                return b - a;
            }
            if (operator.equals(MULTIPLY)) {
                return a * b;
            }
            if (operator.equals(DIVIDE)) {
                return b / a;
            }
            if (operator.equals(POWER)) {
                return Math.pow(b, a);
            }

            return null;
    }


    static Operator getOp(String sign) {


        for (Operator o : Operator.values()) {

            if (o.symbol.equals(sign)){
                return o;
            }

//            if (sign.equals(Operator.PLUS.getSymbol())) {
//                return Operator.PLUS;
//            }
//            if (sign.equals(Operator.MINUS.getSymbol())) {
//                return Operator.MINUS;
//            }
//            if (sign.equals(Operator.MULTIPLY.getSymbol())) {
//                return Operator.MULTIPLY;
//            }
//            if (sign.equals(Operator.DIVIDE.getSymbol())) {
//                return Operator.DIVIDE;
//            }
//            if (sign.equals(Operator.POWER.getSymbol())) {
//                return Operator.POWER;
//            }
//            if (sign.equals(Operator.EQUALS.getSymbol())) {
//                return Operator.EQUALS;
//            }
        }
        return null;
    }


    private final String symbol;

    Operator(String symbol) {
        this.symbol = symbol;
    }

}
