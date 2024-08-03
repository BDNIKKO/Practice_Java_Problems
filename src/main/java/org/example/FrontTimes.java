package org.example;

/**
 * Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
 * or whatever is there if the string is less than length 3. Return n copies of the front.
 * <p>
 * frontTimes("Chocolate", 2) → "ChoCho"
 * frontTimes("Chocolate", 3) → "ChoChoCho"
 * frontTimes("Abc", 3) → "AbcAbcAbc"
 */

public class FrontTimes {
    public String frontTimes(String str, int n) {
        // Determine the "front" of the string, which is the first 3 characters or the entire string if it is less than 3 characters
        String front;
        if (str.length() >= 3) {
            front = str.substring(0, 3);
        } else {
            front = str;
        }

        // Initialize an empty string to store the result
        String result = "";

        // Loop n times to concatenate the front part of the string to the result
        for (int i = 0; i < n; i++) {
            result += front;
        }

        // Return the final concatenated string
        return result;
    }

    // Main method to test the frontTimes function
    public static void main(String[] args) {
        FrontTimes frontTimesChecker = new FrontTimes();

        // Test cases to check various scenarios
        System.out.println(frontTimesChecker.frontTimes("Chocolate", 2)); // "ChoCho", because "Cho" repeated 2 times is "ChoCho"
        System.out.println(frontTimesChecker.frontTimes("Chocolate", 3)); // "ChoChoCho", because "Cho" repeated 3 times is "ChoChoCho"
        System.out.println(frontTimesChecker.frontTimes("Abc", 3));       // "AbcAbcAbc", because "Abc" repeated 3 times is "AbcAbcAbc"
    }
}
