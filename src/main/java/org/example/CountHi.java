package org.example;

/**
 * Return the number of times that the string "hi" appears anywhere in the given string.
 * <p>
 * countHi("abc hi ho") → 1
 * countHi("ABChi hi") → 2
 * countHi("hihi") → 2
 */

public class CountHi {
    public int countHi(String str) {
        // Initialize a counter to count occurrences of "hi"
        int count = 0;

        // Loop through the string, but stop at length - 1 to avoid IndexOutOfBoundsException
        for (int i = 0; i < str.length() - 1; i++) {
            // Check if the substring from the current index to the next two characters is "hi"
            if (str.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }

        // Return the final count of "hi"
        return count;
    }

    // Main method to test the countHi function
    public static void main(String[] args) {
        CountHi countHiChecker = new CountHi();

        // Test cases to check various scenarios
        System.out.println(countHiChecker.countHi("abc hi ho")); // 1, because there is one "hi"
        System.out.println(countHiChecker.countHi("ABChi hi"));  // 2, because there are two "hi"
        System.out.println(countHiChecker.countHi("hihi"));      // 2, because there are two "hi"
    }
}
