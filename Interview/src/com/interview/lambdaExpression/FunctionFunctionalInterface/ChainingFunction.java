package com.interview.lambdaExpression.FunctionFunctionalInterface;

/* function chaining
 * 
 * 			andThen()
 *          compose(
 */

import java.util.function.Function;

public class ChainingFunction {

    public static void main(String[] args) {

        // Define the first function f1 that takes an Integer and adds 2 to it
        Function<Integer, Integer> f1 = n -> n + 2;
        // Function<Integer, Integer> means:
        // - The first Integer is the input type
        // - The second Integer is the return type

        // Define the second function f2 that takes an Integer and cubes it
        Function<Integer, Integer> f2 = n -> n * n * n;

        // Apply the first function f1 to the integer 5
        System.out.println(f1.apply(5)); // Outputs: 7
        // Explanation: f1 takes 5, adds 2, and returns 7

        // Apply the second function f2 to the integer 4
        System.out.println(f2.apply(4)); // Outputs: 64
        // Explanation: f2 takes 4, cubes it (4*4*4), and returns 64

        // Chain the functions using andThen: f1 is applied first, then f2
        System.out.println(f1.andThen(f2).apply(2)); // Outputs: 64
        // Explanation: 
        // - f1 takes 2, adds 2, and returns 4
        // - f2 takes the result from f1 (which is 4), cubes it (4*4*4), and returns 64

        // Chain the functions using compose: f2 is applied first, then f1
        System.out.println(f1.compose(f2).apply(2)); // Outputs: 10
        // Explanation: 
        // - f2 takes 2, cubes it (2*2*2), and returns 8
        // - f1 takes the result from f2 (which is 8), adds 2, and returns 10

    }

}
