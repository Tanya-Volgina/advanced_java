package org.example.calculator;

import org.example.Common.Expression;
import org.example.Common.CalculationResult;

public class Calculator implements ICalculator {
    public CalculationResult calculate(Expression expression) {
        return switch (expression.getSign()) {
            case "+" -> calculatePlus(expression.getFirst(), expression.getSecond());
            case "-" -> calculateMinus(expression.getFirst(),expression.getSecond());
            case "*" -> calculateMultiply(expression.getFirst(),expression.getSecond());
            case "/" -> calculateDivision(expression.getFirst(),expression.getSecond());
            default -> new CalculationResult(null, "Unknown sign");
        };
    }

    private CalculationResult calculatePlus(double first, double second) {
        var result = first + second;
        return new CalculationResult(result, null);
    }

    private CalculationResult calculateMinus(double first, double second){
        var result = first - second;
        return new CalculationResult(result,null);
    }

    private CalculationResult calculateMultiply(double first, double second){
        var result = first * second;
        return new CalculationResult(result, null);
    }

    private CalculationResult calculateDivision(double first, double second){
        var result = first / second;
        return new CalculationResult(result, null);
    }
}
