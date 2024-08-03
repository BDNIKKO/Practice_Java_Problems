package org.example;

public class SleepIn {
    /**
     * Check if we can sleep in.
     * @param weekday true if it's a weekday
     * @param vacation true if we're on vacation
     * @return true if we can sleep in
     */
    public boolean sleepIn(boolean weekday, boolean vacation) {
        // We can sleep in if it's not a weekday or if we're on vacation
        return !weekday || vacation;
    }

    public static void main(String[] args) {
        SleepIn sleepInChecker = new SleepIn();

        // Testing the sleepIn method with different inputs
        System.out.println(sleepInChecker.sleepIn(false, false)); // true: it's not a weekday and not on vacation
        System.out.println(sleepInChecker.sleepIn(true, false));  // false: it's a weekday and not on vacation
        System.out.println(sleepInChecker.sleepIn(false, true));  // true: it's not a weekday but on vacation
    }
}
