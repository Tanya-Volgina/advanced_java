package org.example.calculator;

import org.example.Common.Expression;
import org.example.Common.CalculationResult;

public interface ICalculator {
    CalculationResult calculate(Expression expression);
}
