package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each different string,
 * with the value the number of times that string appears in the array.
 * <p>
 * wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
 * wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
 * wordCount(["c", "c", "c", "c"]) → {"c": 4}
 */

public class WordCount {
    public Map<String, Integer> wordCount(String[] strings) {
        // Create a new HashMap to store the result
        Map<String, Integer> map = new HashMap<>();

        // Loop through each string in the array
        for (String str : strings) {
            // For each string, update the count in the map
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        // Return the resulting map
        return map;
    }

    // Main method to test the wordCount function
    public static void main(String[] args) {
        WordCount wordCountChecker = new WordCount();

        // Test cases to check various scenarios
        System.out.println(wordCountChecker.wordCount(new String[]{"a", "b", "a", "c", "b"})); // {"a": 2, "b": 2, "c": 1}
        System.out.println(wordCountChecker.wordCount(new String[]{"c", "b", "a"})); // {"a": 1, "b": 1, "c": 1}
        System.out.println(wordCountChecker.wordCount(new String[]{"c", "c", "c", "c"})); // {"c": 4}
    }
}
