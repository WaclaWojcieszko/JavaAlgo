package org.wojcieszko.calculator;

public enum InfixOperator {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/"),
    POWER("^"),
    EQUALS("=");

    private final String sign;

    InfixOperator(String sign) {
        this.sign = sign;
    }


    public static InfixOperator getOperator(String operator) {
        for (InfixOperator o : values()) {
            if (o.sign.equals(operator)) {
                return o;
            }
        }
        return null;
    }

    Double calculate(Double a, Double b) {

        if (this.equals(PLUS)) {
            return a + b;
        }
        if (this.equals(MINUS)) {
            return b - a;
        }
        if (this.equals(MULTIPLY)) {
            return a * b;
        }
        if (this.equals(DIVIDE)) {
            return b / a;
        }
        if (this.equals(POWER)) {
            return Math.pow(b, a);
        }

        return null;
    }

}
