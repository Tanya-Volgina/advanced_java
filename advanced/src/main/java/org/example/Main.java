package org.example;

import java.util.Scanner;

public class Main {
    /**
     * Точка входа
     *
     * @param args
     */
    public static void main(String[] args) {

        readNumbers();
    }

    public static void readNumbers() {
        // Метод для ввода чисел в консоль и арифметического знака
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

    /**
     * Метод предназначен для выполнения арифметического дейтсвия.
     *
     * @param firstNumber  первое число.
     * @param secondNumber второе число.
     * @param symbol       Арифметический знак.
     */
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