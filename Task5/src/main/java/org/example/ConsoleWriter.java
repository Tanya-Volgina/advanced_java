package org.example;

import java.util.Map;

public class ConsoleWriter {
    public void showWords(Map<String, Integer> count) {
        if (count.size() == 0) {
            System.out.println("Пусто");

            return;
        }

        int max = Integer.MIN_VALUE;
        System.out.println("Статистика:");
        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            Integer value = entry.getValue();
            if (value > max) max = value;

            System.out.println(entry);
        }

        System.out.println("Максимум повторений у:");
        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            Integer value = entry.getValue();
            if (value == max) {
                System.out.println(entry);
            }
        }
    }
}
