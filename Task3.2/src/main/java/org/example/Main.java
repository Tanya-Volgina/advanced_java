package org.example;

import org.example.Sweets.Marmalade;
import org.example.Sweets.Sweet;
import org.example.Sweets.Chocolate;
import org.example.Sweets.Candy;

public class Main {
    public static void main(String[] args) {
        Sweet[] box = {
                new Candy("Чио рио", 155.30, 1000, "Шоколадные конфеты"),
                new Marmalade("Mamba", 93.51, 350, "Сахар, фруктовый сироп, патока, фруктоза"),
                new Chocolate("Аленка", 90.15, 250, "Коричневый"),
        };

        calculate(box);
    }

    private static void calculate(Sweet[] sweets) {
        double sum = 0;
        double weight = 0;
        for (Sweet sweet : sweets) {
            System.out.println(sweet);

            sum += sweet.getPrice();
            weight += sweet.getWeight();
        }

        System.out.println("Вес: " + weight);
        System.out.printf("Стоимость: %.2f", sum);
    }
}