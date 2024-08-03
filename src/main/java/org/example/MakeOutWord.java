package org.example;

/**
 * Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string,
 * e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
 * <p>
 * makeOutWord("<<>>", "Yay") → "<<Yay>>"
 * makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
 * makeOutWord("[[]]", "word") → "[[word]]"
 */

public class MakeOutWord {
    public String makeOutWord(String out, String word) {
        // Extract the first two characters of the out string
        String firstPart = out.substring(0, 2);

        // Extract the last two characters of the out string
        String lastPart = out.substring(2);

        // Concatenate the first part, the word, and the last part to form the result
        return firstPart + word + lastPart;
    }

    // Main method to test the makeOutWord function
    public static void main(String[] args) {
        MakeOutWord makeOutWordChecker = new MakeOutWord();

        // Test cases to check various scenarios
        System.out.println(makeOutWordChecker.makeOutWord("<<>>", "Yay"));     // "<<Yay>>"
        System.out.println(makeOutWordChecker.makeOutWord("<<>>", "WooHoo")); // "<<WooHoo>>"
        System.out.println(makeOutWordChecker.makeOutWord("[[]]", "word"));   // "[[word]]"
    }
}
