package com.interview.lambdaExpression.ConsumerFunctionalInterface;

import java.util.function.Consumer; // Import the Consumer interface from java.util.function package

public class ConsumerUse {

    public static void main(String[] args) {

        // Define a Consumer that takes an Integer and prints its square
        Consumer<Integer> con1 = s -> System.out.println("Square of number: " + s * s);
        // Consumer<Integer> means:
        // - The Consumer takes a single input of type Integer and performs some operation without returning a result
        // - In this case, it calculates the square of the input number and prints it

        // Define a Consumer that takes a String and prints its length
        Consumer<String> con2 = s -> System.out.println("Length of String: " + s.length());
        // Consumer<String> means:
        // - The Consumer takes a single input of type String and performs some operation without returning a result
        // - In this case, it calculates the length of the input string and prints it

        // Use the first Consumer to calculate and print the square of 10
        con1.accept(10); // Outputs: Square of number: 100
        // Explanation: The accept method of con1 is called with the input 10
        // - con1 takes 10, calculates 10 * 10, and prints "Square of number: 100"

        // Use the second Consumer to calculate and print the length of the string "indrajit"
        con2.accept("indrajit"); // Outputs: Length of String: 8
        // Explanation: The accept method of con2 is called with the input "indrajit"
        // - con2 takes "indrajit", calculates its length (8), and prints "Length of String: 8"

    }

}
