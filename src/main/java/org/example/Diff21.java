package org.example;

public class Diff21 {
    public int diff21(int n) {
        // If n is 21 or less, return the absolute difference between 21 and n
        if (n <= 21) {
            return 21 - n;
        } else {
            // If n is greater than 21, return double the absolute difference
            return (n - 21) * 2;
        }
    }

    // Main method to test the diff21 function
    public static void main(String[] args) {
        Diff21 diff21Checker = new Diff21();

        // Test cases
        System.out.println(diff21Checker.diff21(19));  // 2
        System.out.println(diff21Checker.diff21(10));  // 11
        System.out.println(diff21Checker.diff21(21));  // 0
    }
}
