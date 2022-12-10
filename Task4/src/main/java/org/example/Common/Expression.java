package org.example.Common;

public class Expression {
    private double first;
    private double second;
    private String sign;

    public Expression(double first, double second, String sign){

        this.first = first;
        this.second = second;
        this.sign = sign;
    }

    public double getFirst() {
        return first;
    }

    public double getSecond() {
        return second;
    }

    public String getSign() {
        return sign;
    }
}
