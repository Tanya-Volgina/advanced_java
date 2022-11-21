package org.example;

import java.util.Scanner;

public class WordService {
    public void findWord() {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество слов: ");
        int quantity = in.nextInt();
        in.nextLine();

        if (quantity <= 0) {
            System.out.println("Введено не верное количество слов");
            return;
        }

        String[] strings = getStrings(in, quantity);
        findMaxWord(strings);
    }

    private static String[] getStrings(Scanner in, int quantity) {
        String strArray[] = new String[quantity];
        System.out.println("Введите слова");
        for (int i = 0; i < quantity; i++) {
            System.out.print(i + 1 + " слово: ");
            strArray[i] = in.nextLine();
        }

        return strArray;
    }

    private static void findMaxWord(String[] lines) {
        int maxLength = lines[0].length();
        int maxIndex = 0;

        for (int i = 1; i < lines.length; i++) {
            if (lines[i].length() > maxLength) {
                maxLength = lines[i].length();
                maxIndex = i;
            }
        }

        System.out.println(lines[maxIndex]);
    }
}
