package org.example;

/**
 * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
 * We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
 * <p>
 * monkeyTrouble(true, true) → true
 * monkeyTrouble(false, false) → true
 * monkeyTrouble(true, false) → false
 */

public class MonkeyTrouble {
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        // We need to check if both monkeys are either smiling or not smiling
        // If both aSmile and bSmile are true, we are in trouble
        // If both aSmile and bSmile are false, we are also in trouble
        // If one is smiling and the other is not, we are not in trouble
        return (aSmile && bSmile) || (!aSmile && !bSmile);
    }

    // Main method to test the monkeyTrouble function
    public static void main(String[] args) {
        MonkeyTrouble monkeyTroubleChecker = new MonkeyTrouble();

        // Testing cases to check various scenarios
        System.out.println(monkeyTroubleChecker.monkeyTrouble(true, true));   // true, both are smiling
        System.out.println(monkeyTroubleChecker.monkeyTrouble(false, false)); // true, neither is smiling
        System.out.println(monkeyTroubleChecker.monkeyTrouble(true, false));  // false, only one is smiling
    }
}
