package org.example.Calculator;

import org.example.Common.Expression;
import org.example.Exceptions.InvalidSignException;

public class Calculator implements ICalculator {
    public double calculate(Expression expression) throws InvalidSignException, ArithmeticException {
        return switch (expression.getSign()) {
            case "+" -> calculatePlus(expression.getFirst(), expression.getSecond());
            case "-" -> calculateMinus(expression.getFirst(), expression.getSecond());
            case "*" -> calculateMultiply(expression.getFirst(), expression.getSecond());
            case "/" -> calculateDivision(expression.getFirst(), expression.getSecond());
            default -> throw new InvalidSignException("Unknown sign");
        };
    }

    private double calculatePlus(double first, double second) {
        return first + second;
    }

    private double calculateMinus(double first, double second) {
        return first - second;
    }

    private double calculateMultiply(double first, double second) {
        return first * second;
    }

    private double calculateDivision(double first, double second) {
        if (second == 0) {
            throw new ArithmeticException("Can't divide by zero");
        } else {
            return first / second;
        }
    }
}

