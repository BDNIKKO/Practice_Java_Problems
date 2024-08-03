package org.example;

/**
 * Given a string, return a string where for every char in the original, there are two chars.
 * <p>
 * doubleChar("The") → "TThhee"
 * doubleChar("AAbb") → "AAAAbbbb"
 * doubleChar("Hi-There") → "HHii--TThheerree"
 */

public class DoubleChar {
    public String doubleChar(String str) {
        // Initialize an empty string to store the result
        String result = "";

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Append each character twice to the result
            result = result + str.charAt(i) + str.charAt(i);
        }

        // Return the final string with each character doubled
        return result;
    }

    // Main method to test the doubleChar function
    public static void main(String[] args) {
        DoubleChar doubleCharChecker = new DoubleChar();

        // Test cases to check various scenarios
        System.out.println(doubleCharChecker.doubleChar("The"));     // "TThhee"
        System.out.println(doubleCharChecker.doubleChar("AAbb"));    // "AAAAbbbb"
        System.out.println(doubleCharChecker.doubleChar("Hi-There")); // "HHii--TThheerree"
    }
}
