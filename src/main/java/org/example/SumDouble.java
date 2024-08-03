package org.example;

/**
 * Given two int values, return their sum. Unless the two values are the same, then return double their sum.
 * <p>
 * sumDouble(1, 2) → 3
 * sumDouble(3, 2) → 5
 * sumDouble(2, 2) → 8
 */

public class SumDouble {
    public int sumDouble(int a, int b) {
        // First, we check if the two values are the same
        if (a == b) {
            // If they are the same, this returns double their sum
            return 2 * (a + b);
        } else {
            // If they are different, this returns their sum
            return a + b;
        }
    }

    // Main method to test the sumDouble function
    public static void main(String[] args) {
        SumDouble sumDoubleChecker = new SumDouble();

        // Testing cases to check various scenarios
        System.out.println(sumDoubleChecker.sumDouble(1, 2)); // 3, because 1 + 2 = 3
        System.out.println(sumDoubleChecker.sumDouble(3, 2)); // 5, because 3 + 2 = 5
        System.out.println(sumDoubleChecker.sumDouble(2, 2)); // 8, because 2 + 2 = 4 and double is 8
    }
}
