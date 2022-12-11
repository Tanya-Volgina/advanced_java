package org.example;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Reader {
    public ArrayList<String> readWords() {
        String path = System.getProperty("user.dir") + "\\текст.txt";

        String word = "";
        ArrayList<String> words = new ArrayList<>();
        try (FileReader reader = new FileReader(path)) {
            int c;
            while ((c = reader.read()) != -1) {
                String symbol = Character.toString(c);
                if (symbol.equals(" ")) {
                    words.add(word);
                    word = "";
                } else {
                    word += symbol;
                }
            }

            words.add(word);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        return words;
    }
}