package org.example;

/**
 * Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
 * <p>
 * countXX("abcxx") → 1
 * countXX("xxx") → 2
 * countXX("xxxx") → 3
 */

public class CountXX {
    public int countXX(String str) {
        // Initialize a counter to count occurrences of "xx"
        int count = 0;

        // Loop through the string, but stop at length - 1 to avoid IndexOutOfBoundsException
        for (int i = 0; i < str.length() - 1; i++) {
            // Check if the substring from the current index to the next two characters is "xx"
            if (str.substring(i, i + 2).equals("xx")) {
                count++;
            }
        }

        // Return the final count of "xx"
        return count;
    }

    // Main method to test the countXX function
    public static void main(String[] args) {
        CountXX countXXChecker = new CountXX();

        // Test cases to check various scenarios
        System.out.println(countXXChecker.countXX("abcxx")); // 1, because there is one "xx"
        System.out.println(countXXChecker.countXX("xxx"));   // 2, because there are two overlapping "xx"
        System.out.println(countXXChecker.countXX("xxxx"));  // 3, because there are three overlapping "xx"
    }
}
