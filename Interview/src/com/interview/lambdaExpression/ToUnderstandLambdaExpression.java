package com.interview.lambdaExpression;

import java.util.Scanner;

// Functional interface for addition
@FunctionalInterface
interface Demo {
    public void addition(int a, int b);
}

// Functional interface for subtraction
@FunctionalInterface
interface Demo2 {
    public int substraction(int a, int b);
}

// Class implementing both interfaces (commented out since we're focusing on lambda expressions)
// class Test implements Demo, Demo2 {

//     @Override
//     public void addition(int a, int b) {
//         System.out.println("Addition of given numbers is " + (a + b));
//     }

//     @Override
//     public int substraction(int a, int b) {
//         System.out.println("Subtraction of given numbers is " + (a - b));
//         return (a - b);
//     }
// }

public class ToUnderstandLambdaExpression {
    public static void main(String[] args) {
        // Prompt user for input
        System.out.println("Enter two numbers:");
        Scanner sobj = new Scanner(System.in);
        int no = sobj.nextInt();
        int no2 = sobj.nextInt();

        // Addition using Test class
        // Step 1: Create reference and object of Test class
        // Test test = new Test();
        // test.addition(no, no2);

        // Step 2: Create reference of interface and object of Test class
        // Demo test = new Test();
        // test.addition(no, no2);

        // Step 3: Use lambda expression for addition without Test class
        Demo testAddition = (a, b) -> System.out.println("Addition of given numbers is " + (a + b));
        testAddition.addition(no, no2);

        // Subtraction using Test class
        // Step 1: Create reference and object of Test class
        // Test test = new Test();
        // System.out.println(test.substraction(no, no2));

        // Step 2: Create reference of interface and object of Test class
        // Demo2 dob = new Test();
        // System.out.println(dob.substraction(no, no2));

        // Step 3: Use lambda expression for subtraction without Test class
        Demo2 testSubtraction = (a, b) -> {
            System.out.println("Subtraction of given numbers is " + (a - b));
            return (a - b);
        };
        System.out.println(testSubtraction.substraction(no, no2));
    }
}
