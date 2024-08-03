package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys.
 * If both keys are present, append their 2 string values together and store the result under the key "ab".
 * <p>
 * mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
 * mapAB({"a": "Hi"}) → {"a": "Hi"}
 * mapAB({"b": "There"}) → {"b": "There"}
 */

public class MapAB {
    public Map<String, String> mapAB(Map<String, String> map) {
        // Check if the map contains both keys "a" and "b"
        if (map.containsKey("a") && map.containsKey("b")) {
            // If both keys are present, append their values and store the result under the key "ab"
            map.put("ab", map.get("a") + map.get("b"));
        }
        // Return the modified map
        return map;
    }

    // Main method to test the mapAB function
    public static void main(String[] args) {
        MapAB mapABChecker = new MapAB();

        // Test cases to check various scenarios
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "Hi");
        map1.put("b", "There");
        System.out.println(mapABChecker.mapAB(map1)); // {"a": "Hi", "ab": "HiThere", "b": "There"}

        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "Hi");
        System.out.println(mapABChecker.mapAB(map2)); // {"a": "Hi"}

        Map<String, String> map3 = new HashMap<>();
        map3.put("b", "There");
        System.out.println(mapABChecker.mapAB(map3)); // {"b": "There"}
    }
}
