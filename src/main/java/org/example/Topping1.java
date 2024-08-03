package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a map of food keys and topping values, modify and return the map as follows: if the key "ice cream" is present,
 * set its value to "cherry". In all cases, set the key "bread" to have the value "butter".
 * <p>
 * topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
 * topping1({}) → {"bread": "butter"}
 * topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}
 */

public class Topping1 {
    public Map<String, String> topping1(Map<String, String> map) {
        // Check if the map contains the key "ice cream"
        if (map.containsKey("ice cream")) {
            // If "ice cream" is present, set its value to "cherry"
            map.put("ice cream", "cherry");
        }
        // In all cases, set the key "bread" to have the value "butter"
        map.put("bread", "butter");
        // Return the modified map
        return map;
    }

    // Main method to test the topping1 function
    public static void main(String[] args) {
        Topping1 topping1Checker = new Topping1();

        // Test cases to check various scenarios
        Map<String, String> map1 = new HashMap<>();
        map1.put("ice cream", "peanuts");
        System.out.println(topping1Checker.topping1(map1)); // {"bread": "butter", "ice cream": "cherry"}

        Map<String, String> map2 = new HashMap<>();
        System.out.println(topping1Checker.topping1(map2)); // {"bread": "butter"}

        Map<String, String> map3 = new HashMap<>();
        map3.put("pancake", "syrup");
        System.out.println(topping1Checker.topping1(map3)); // {"bread": "butter", "pancake": "syrup"}
    }
}
