package org.example;

import java.util.Scanner;

public class Calculator {
    public void calculate() {

        readNumbers();
    }

    public static void readNumbers() {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число ");
        double first = in.nextDouble();

        System.out.print("Введите второе число ");
        double second = in.nextDouble();

        System.out.print("Введите один из символов: +, -, *, / ");
        String symbol = in.next();

        in.close();

        calculate(first, second, symbol);
    }

    public static void calculate(double firstNumber, double secondNumber, String symbol) {
        switch (symbol) {
            case "+":
                System.out.printf("%.4f", firstNumber + secondNumber);
                break;
            case "-":
                System.out.printf("%.4f", firstNumber - secondNumber);
                break;
            case "*":
                System.out.printf("%.4f", firstNumber * secondNumber);
                break;
            case "/":
                if (secondNumber == 0)
                    System.err.println("На ноль делить нельзя!");
                else
                    System.out.printf("%.4f", firstNumber / secondNumber);
                break;
            default:
                System.err.println("Неизвестный символ");
                break;
        }
    }
}
