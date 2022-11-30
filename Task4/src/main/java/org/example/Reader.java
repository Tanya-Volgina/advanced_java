package org.example;
import java.util.Scanner;

public class Reader {
    public Expression readNumbers() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число ");
        double first = in.nextDouble();

        System.out.print("Введите второе число ");
        double second = in.nextDouble();

        System.out.print("Введите один из символов: +, -, *, / ");
        String sign = in.next();

        in.close();

        return new Expression(first, second, sign);
    }
}
