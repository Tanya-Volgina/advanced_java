package org.example.Calculator;

import org.example.Common.Expression;
import org.example.Exceptions.InvalidSignException;

public interface ICalculator {
    double calculate(Expression expression) throws InvalidSignException, ArithmeticException;
}
