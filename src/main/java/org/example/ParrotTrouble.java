package org.example;

/**
 * We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
 * We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
 * <p>
 * parrotTrouble(true, 6) → true
 * parrotTrouble(true, 7) → false
 * parrotTrouble(false, 6) → false
 */

public class ParrotTrouble {
    public boolean parrotTrouble(boolean talking, int hour) {
        // We are in trouble if the parrot is talking and the hour is before 7 or after 20
        return talking && (hour < 7 || hour > 20);
    }

    // Main method to test the parrotTrouble function
    public static void main(String[] args) {
        ParrotTrouble parrotTroubleChecker = new ParrotTrouble();

        // Test cases to check various scenarios
        System.out.println(parrotTroubleChecker.parrotTrouble(true, 6));  // true, parrot is talking and hour is before 7
        System.out.println(parrotTroubleChecker.parrotTrouble(true, 7));  // false, parrot is talking but hour is not before 7 or after 20
        System.out.println(parrotTroubleChecker.parrotTrouble(false, 6)); // false, parrot is not talking
    }
}
