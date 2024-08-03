package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value,
 * and set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the empty string.
 * <p>
 * mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
 * mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
 * mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
 */

public class MapBully {
    public Map<String, String> mapBully(Map<String, String> map) {
        // Check if the map contains the key "a"
        if (map.containsKey("a")) {
            // If it does, set the value of key "b" to the value of key "a"
            map.put("b", map.get("a"));
            // Set the value of key "a" to the empty string
            map.put("a", "");
        }
        // Return the modified map
        return map;
    }

    // Main method to test the mapBully function
    public static void main(String[] args) {
        MapBully mapBullyChecker = new MapBully();

        // Test cases to check various scenarios
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "candy");
        map1.put("b", "dirt");
        System.out.println(mapBullyChecker.mapBully(map1)); // {"a": "", "b": "candy"}

        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "candy");
        System.out.println(mapBullyChecker.mapBully(map2)); // {"a": "", "b": "candy"}

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "candy");
        map3.put("b", "carrot");
        map3.put("c", "meh");
        System.out.println(mapBullyChecker.mapBully(map3)); // {"a": "", "b": "candy", "c": "meh"}
    }
}
