package org.example;

import org.example.Readers.IReader;
import org.example.Readers.Reader;
import org.example.Calculator.Calculator;
import org.example.Common.Expression;
import org.example.Calculator.ICalculator;

public class Main {
    private static IReader reader = new Reader();
    private static ICalculator calculator = new Calculator();

    public static void main(String[] args) {
        try {
            Expression input = reader.read();
            double result = calculator.calculate(input);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}