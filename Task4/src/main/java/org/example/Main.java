package org.example;

import org.example.calculator.*;

public class Main {
    private static Reader reader = new Reader();

    public static void main(String[] args) {
        Expression input = reader.readNumbers();
        Calculator calculator = getCalculator(input.getSign());

        try{
            var answer = calculator.calculate(input.getFirst(), input.getSecond());
            System.out.println(answer);
        }
        catch(Exception exception){
            System.out.println(exception.getMessage());
        }
    }

    private static Calculator getCalculator(String sign) {
        return switch(sign) {
            case "+" ->  new PlusCalculator();
            case "-" -> new MinusCalculator();
            case "/" -> new DivisionCalculator();
            case "*" -> new MultiplyCalculator();
            default -> null;
        };
    }
}