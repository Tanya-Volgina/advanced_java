package org.example;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Counter {
    public Map<String, Integer> countWords(ArrayList<String> words) {
        Map<String, Integer> wordsInfo = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        for (String word : words) {
            if (wordsInfo.containsKey(word)) {
                Integer currentCount = wordsInfo.get(word);
                wordsInfo.put(word, ++currentCount);
            } else {
                wordsInfo.put(word, 1);
            }
        }

        return wordsInfo;
    }
}
