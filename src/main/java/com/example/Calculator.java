
package com.example;

public class Calculator {

    // Method for addition
    public int add(int a, int b) {
        return a + b;
    }

    // Method for subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

    // Main method - application starts here
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int addition = calculator.add(10, 5);
        int subtraction = calculator.subtract(10, 5);

        System.out.println("===== JAVA CALCULATOR =====");
        System.out.println("Addition: 10 + 5 = " + addition);
        System.out.println("Subtraction: 10 - 5 = " + subtraction);
    }
}

