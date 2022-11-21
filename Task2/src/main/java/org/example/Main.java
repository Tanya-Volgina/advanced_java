package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите 1 - запустить выполнение калькулятора; Введите 2 -  поиск максимального слова в массиве");
        int number = in.nextInt();

        runAction(number);
    }

    public static void runAction(int number) {
        switch (number) {
            case 1 -> {
                Calculator calculator = new Calculator();
                calculator.calculate();
            }
            case 2 -> {
                WordService wordService = new WordService();
                wordService.findWord();
            }
            default -> System.err.println("Неизвестный символ");
        }
    }
}



