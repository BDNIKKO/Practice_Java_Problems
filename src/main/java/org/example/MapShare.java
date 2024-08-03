package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value.
 * In all cases remove the key "c", leaving the rest of the map unchanged.
 * <p>
 * mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
 * mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
 * mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
 */

public class MapShare {
    public Map<String, String> mapShare(Map<String, String> map) {
        // Check if the map contains the key "a"
        if (map.containsKey("a")) {
            // If it does, set the value of key "b" to the value of key "a"
            map.put("b", map.get("a"));
        }
        // Remove the key "c" from the map
        map.remove("c");
        // Return the modified map
        return map;
    }

    // Main method to test the mapShare function
    public static void main(String[] args) {
        MapShare mapShareChecker = new MapShare();

        // Test cases to check various scenarios
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("b", "bbb");
        map1.put("c", "ccc");
        System.out.println(mapShareChecker.mapShare(map1)); // {"a": "aaa", "b": "aaa"}

        Map<String, String> map2 = new HashMap<>();
        map2.put("b", "xyz");
        map2.put("c", "ccc");
        System.out.println(mapShareChecker.mapShare(map2)); // {"b": "xyz"}

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "aaa");
        map3.put("c", "meh");
        map3.put("d", "hi");
        System.out.println(mapShareChecker.mapShare(map3)); // {"a": "aaa", "b": "aaa", "d": "hi"}
    }
}
