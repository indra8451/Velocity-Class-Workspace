package com.interview.lambdaExpression.ConsumerFunctionalInterface;

import java.util.function.Consumer;

import java.util.function.Consumer; // Import the Consumer interface

public class ConsumerChaining {

    public static void main(String[] args) {
        
        // Define the first Consumer that prints a message stating the country is "my country"
        Consumer<String> con1 = s -> System.out.println(s + " " + "is my country");
        // Consumer<String> means:
        // - The Consumer takes a single input of type String and performs some operation without returning a result

        // Define the second Consumer that prints a message stating the country is "beautiful"
        Consumer<String> con2 = s -> System.out.println(s + " " + "is beautiful");

        // Define the third Consumer that prints a message stating the country is "developing fast"
        Consumer<String> con3 = s -> System.out.println(s + " " + "is developing fastly");

        // The commented out code shows how each Consumer can be applied individually
        // con1.accept("India");
        // con2.accept("India");
        // con3.accept("India");

        // Chain the Consumers using andThen and apply them to the string "India"
        con1.andThen(con2).andThen(con3).accept("India");
        // Explanation:
        // - con1.andThen(con2) creates a new Consumer that first applies con1 and then applies con2
        // - .andThen(con3) further chains con3 to the previous chain, creating a single Consumer that applies con1, con2, and con3 in order
        // - .accept("India") applies the chained Consumer to the string "India"
        //   - con1 is applied first, printing "India is my country"
        //   - con2 is applied second, printing "India is beautiful"
        //   - con3 is applied third, printing "India is developing fastly"
    }

}
