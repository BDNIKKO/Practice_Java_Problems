package org.example;

/**
 * You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness of your clothes, in the range 0..10,
 * and "date" is the stylishness of your date's clothes. The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes.
 * If either of you is very stylish, 8 or more, then the result is 2 (yes). With the exception that if either of you has style of 2 or less,
 * then the result is 0 (no). Otherwise, the result is 1 (maybe).
 * <p>
 * dateFashion(5, 10) → 2
 * dateFashion(5, 2) → 0
 * dateFashion(5, 5) → 1
 */

public class DateFashion {
    public int dateFashion(int you, int date) {
        // Check if either you or your date has a style of 2 or less
        if (you <= 2 || date <= 2) {
            // If so, the result is 0 (no)
            return 0;
        }
        // Check if either you or your date has a style of 8 or more
        if (you >= 8 || date >= 8) {
            // If so, the result is 2 (yes)
            return 2;
        }
        // Otherwise, the result is 1 (maybe)
        return 1;
    }

    // Main method to test the dateFashion function
    public static void main(String[] args) {
        DateFashion dateFashionChecker = new DateFashion();

        // Test cases to check various scenarios
        System.out.println(dateFashionChecker.dateFashion(5, 10)); // 2, date is very stylish
        System.out.println(dateFashionChecker.dateFashion(5, 2));  // 0, date is not stylish at all
        System.out.println(dateFashionChecker.dateFashion(5, 5));  // 1, both are moderately stylish
    }
}
