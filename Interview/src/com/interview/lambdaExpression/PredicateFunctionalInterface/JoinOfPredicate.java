package com.interview.lambdaExpression.PredicateFunctionalInterface;

/*
Joining Predicates
Using "AND" (&&)
The logical "AND" operation combines two predicates and evaluates to true only if both predicates are true.
 In Java, this is represented by the && operator.
 
 Using "OR" (||)
The logical "OR" operation combines two predicates and evaluates to true if at least one of the predicates is true. 
In Java, this is represented by the || operator.


Negate
Negation inverts the truth value of a predicate. In Java, this is represented by the ! operator.

Truth Table for NOT (!):

Predicate	!Predicate
true	false
false	true
 */


import java.util.function.Predicate;

public class JoinOfPredicate {

    public static void main(String[] args) {
        // Initialize an array of integers
        int arr[] = {1, 20, 40, 15, 3, 2, 8, 5, 100};

        // Define a predicate p1 that checks if a number is even
        Predicate<Integer> p1 = i -> i % 2 == 0;

        // Define a predicate p2 that checks if a number is greater than 50
        Predicate<Integer> p2 = i -> i > 50;

        // Loop through each number in the array
        for (int no : arr) {
            /*
             * The following commented-out code demonstrates a manual check for both predicates:
             * if (p1.test(no) && p2.test(no)) {
             *     System.out.println(no);
             * }
             */

            // Use the 'and' method to combine both predicates and test each number
            if (p1.and(p2).test(no)) {
                // Print the number if it satisfies both predicates
                System.out.println(no);
            }
            
            // Use the 'or' method to combine both predicates and test each number
            if (p1.or(p2).test(no))             //if (p1.test(no) || p2.test(no))
            {
                // Print the number if it satisfies both predicates
                System.out.println(no);
            }
            
            // // Print the number if it does not satisfy predicate p1 (i.e., it is not even means odd number print)
            if(p1.negate().test(no))  
            {
            	System.out.println(no);
            }
        }
    }
}

