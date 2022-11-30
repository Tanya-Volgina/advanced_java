package org.example.calculator;

public class DivisionCalculator extends Calculator {
    @Override
    public double calculate(double first, double second) {
        if (second == 0) {
            if (first == 0) return Double.NaN;

            return first > 0
                    ? Double.POSITIVE_INFINITY
                    : Double.NEGATIVE_INFINITY;
        }

        return first / second;
    }
}
