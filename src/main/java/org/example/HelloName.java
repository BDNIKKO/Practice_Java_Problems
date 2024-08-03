package org.example;

/**
 * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
 * <p>
 * helloName("Bob") → "Hello Bob!"
 * helloName("Alice") → "Hello Alice!"
 * helloName("X") → "Hello X!"
 */

public class HelloName {
    public String helloName(String name) {
        // Concatenate "Hello ", the given name, and "!" to form the greeting
        return "Hello " + name + "!";
    }

    // Main method to test the helloName function
    public static void main(String[] args) {
        HelloName helloNameChecker = new HelloName();

        // Test cases to check various scenarios
        System.out.println(helloNameChecker.helloName("Bob"));    // "Hello Bob!"
        System.out.println(helloNameChecker.helloName("Alice"));  // "Hello Alice!"
        System.out.println(helloNameChecker.helloName("X"));      // "Hello X!"
    }
}
