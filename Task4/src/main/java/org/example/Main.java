package org.example;

import org.example.Common.CalculationResult;
import org.example.Readers.IReader;
import org.example.Readers.Reader;
import org.example.calculator.Calculator;
import org.example.Common.Expression;
import org.example.calculator.ICalculator;

public class Main {
    private static IReader reader = new Reader();
    private static ICalculator calculator = new Calculator();

    public static void main(String[] args) {
        Expression input = reader.read();
        CalculationResult result = calculator.calculate(input);

        if(result.isValid()){
            System.out.println(result.getResult());
        }
        else{
            System.out.println(result.getError());
        }
    }
}