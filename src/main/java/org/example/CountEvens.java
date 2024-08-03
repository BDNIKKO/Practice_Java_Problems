package org.example;

/**
 * Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
 * <p>
 * countEvens([2, 1, 2, 3, 4]) → 3
 * countEvens([2, 2, 0]) → 3
 * countEvens([1, 3, 5]) → 0
 */

public class CountEvens {
    public int countEvens(int[] nums) {
        // Initialize a counter to count the even numbers
        int count = 0;

        // Loop through each number in the array
        for (int num : nums) {
            // Check if the number is even
            if (num % 2 == 0) {
                // Increment the counter if the number is even
                count++;
            }
        }

        // Return the final count of even numbers
        return count;
    }

    // Main method to test the countEvens function
    public static void main(String[] args) {
        CountEvens countEvensChecker = new CountEvens();

        // Test cases to check various scenarios
        System.out.println(countEvensChecker.countEvens(new int[]{2, 1, 2, 3, 4})); // 3, because there are three even numbers
        System.out.println(countEvensChecker.countEvens(new int[]{2, 2, 0}));       // 3, because all numbers are even
        System.out.println(countEvensChecker.countEvens(new int[]{1, 3, 5}));       // 0, because there are no even numbers
    }
}
