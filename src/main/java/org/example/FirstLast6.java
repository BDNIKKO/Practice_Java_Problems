package org.example;

/**
 * Given an array of ints, return true if 6 appears as either the first or last element in the array.
 * The array will be length 1 or more.
 * <p>
 * firstLast6([1, 2, 6]) → true
 * firstLast6([6, 1, 2, 3]) → true
 * firstLast6([13, 6, 1, 2, 3]) → false
 */

public class FirstLast6 {
    public boolean firstLast6(int[] nums) {
        // Check if the first element is 6 or the last element is 6
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }

    // Main method to test the firstLast6 function
    public static void main(String[] args) {
        FirstLast6 firstLast6Checker = new FirstLast6();

        // Test cases to check various scenarios
        System.out.println(firstLast6Checker.firstLast6(new int[]{1, 2, 6})); // true, because the last element is 6
        System.out.println(firstLast6Checker.firstLast6(new int[]{6, 1, 2, 3})); // true, because the first element is 6
        System.out.println(firstLast6Checker.firstLast6(new int[]{13, 6, 1, 2, 3})); // false, because neither the first nor the last element is 6
    }
}
