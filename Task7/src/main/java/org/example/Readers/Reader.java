package org.example.Readers;

import org.example.Common.Expression;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Reader implements IReader {
    public Expression read() throws InputMismatchException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double first = read(in);

        System.out.print("Введите второе число: ");
        double second = read(in);

        System.out.print("Введите один из символов: +, -, *, / ");
        String sign = in.next();

        in.close();

        return new Expression(first, second, sign);
    }

    private double read(Scanner in) throws InputMismatchException {
        if(in.hasNextDouble()){
            return in.nextDouble();
        }

        throw new InputMismatchException("Incorrect number");
    }
}
