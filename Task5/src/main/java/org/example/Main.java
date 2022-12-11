package org.example;

import java.util.*;

public class Main {
    private static Reader reader = new Reader();
    private static Counter counter = new Counter();
    private static ConsoleWriter writer = new ConsoleWriter();

    public static void main(String[] args) {
        ArrayList<String> words = reader.readWords();
        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
        Map<String, Integer> count = counter.countWords(words);
        writer.showWords(count);
    }
}