package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array,
 * always with the value 0. For example the string "hello" makes the pair "hello":0. We'll do more complicated counting later,
 * but for this problem the value is simply 0.
 * <p>
 * word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0}
 * word0(["a", "b", "a", "c", "b"]) → {"a": 0, "b": 0, "c": 0}
 * word0(["c", "b", "a"]) → {"a": 0, "b": 0, "c": 0}
 */

public class Word0 {
    public Map<String, Integer> word0(String[] strings) {
        // Create a new HashMap to store the result
        Map<String, Integer> map = new HashMap<>();

        // Loop through each string in the array
        for (String str : strings) {
            // Put the string in the map with a value of 0
            map.put(str, 0);
        }

        // Return the resulting map
        return map;
    }

    // Main method to test the word0 function
    public static void main(String[] args) {
        Word0 word0Checker = new Word0();

        // Test cases to check various scenarios
        System.out.println(word0Checker.word0(new String[]{"a", "b", "a", "b"})); // {"a": 0, "b": 0}
        System.out.println(word0Checker.word0(new String[]{"a", "b", "a", "c", "b"})); // {"a": 0, "b": 0, "c": 0}
        System.out.println(word0Checker.word0(new String[]{"c", "b", "a"})); // {"a": 0, "b": 0, "c": 0}
    }
}
