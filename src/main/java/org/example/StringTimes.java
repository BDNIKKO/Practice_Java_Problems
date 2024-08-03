package org.example;

/**
 * Given a string and a non-negative int n, return a larger string that is n copies of the original string.
 * <p>
 * stringTimes("Hi", 2) → "HiHi"
 * stringTimes("Hi", 3) → "HiHiHi"
 * stringTimes("Hi", 1) → "Hi"
 */

public class StringTimes {
    public String stringTimes(String str, int n) {
        // Initialize an empty string to store the result
        String result = "";

        // Loop n times to concatenate the original string to the result
        for (int i = 0; i < n; i++) {
            result += str;
        }

        // Return the final concatenated string
        return result;
    }

    // Main method to test the stringTimes function
    public static void main(String[] args) {
        StringTimes stringTimesChecker = new StringTimes();

        // Test cases to check various scenarios
        System.out.println(stringTimesChecker.stringTimes("Hi", 2)); // "HiHi", because "Hi" repeated 2 times is "HiHi"
        System.out.println(stringTimesChecker.stringTimes("Hi", 3)); // "HiHiHi", because "Hi" repeated 3 times is "HiHiHi"
        System.out.println(stringTimesChecker.stringTimes("Hi", 1)); // "Hi", because "Hi" repeated 1 time is "Hi"
    }
}
