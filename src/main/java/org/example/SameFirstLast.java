package org.example;

/**
 * Given an array of ints, return true if the array is length 1 or more,
 * and the first element and the last element are equal.
 * <p>
 * sameFirstLast([1, 2, 3]) → false
 * sameFirstLast([1, 2, 3, 1]) → true
 * sameFirstLast([1, 2, 1]) → true
 */

public class SameFirstLast {
    public boolean sameFirstLast(int[] nums) {
        // Check if the array length is 1 or more
        if (nums.length >= 1) {
            // Return true if the first and last elements are equal
            return nums[0] == nums[nums.length - 1];
        }
        // Return false if the array length is less than 1
        return false;
    }

    // Main method to test the sameFirstLast function
    public static void main(String[] args) {
        SameFirstLast sameFirstLastChecker = new SameFirstLast();

        // Test cases to check various scenarios
        System.out.println(sameFirstLastChecker.sameFirstLast(new int[]{1, 2, 3})); // false, first and last elements are different
        System.out.println(sameFirstLastChecker.sameFirstLast(new int[]{1, 2, 3, 1})); // true, first and last elements are the same
        System.out.println(sameFirstLastChecker.sameFirstLast(new int[]{1, 2, 1})); // true, first and last elements are the same
    }
}
