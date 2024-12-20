package com.interview.lambdaExpression.FunctionFunctionalInterface;

import java.util.function.Function; // Import the Function interface from java.util.function package
import java.util.Scanner; // Import the Scanner class for taking user input

public class Function_FunctionalInterfaceforPremitiveDatatype {

    public static void main(String[] args) 
    {
    	//Example 1 : Define a Function that takes an Integer and returns its square
    	
        Function<Integer, Integer> squareFunction = n -> n * n;
        // The Function interface: Function<Integer, Integer>
        // - First Integer: Type of the input parameter (n)
        // - Second Integer: Type of the return value (n * n)

        
        // Prompt the user to enter a number
        System.out.println("Enter the Number to print its square:");
        
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Read the integer input from the user
        int no = scanner.nextInt();
        
        // Apply the function to compute the square of the input number
        int square = squareFunction.apply(no);
        
        // Print the result
        System.out.println("Square of given number " + no + " is " + square);
        
        
        // Example 2: Define a Function that takes an String and returns its length as Integer
        
        Function<String, Integer> stringLenFun = str -> str.length();
        // The Function interface: Function<String, Integer>
        // - First String: Type of the input parameter (str)
        // - Integer: Type of the return value (str.length())

        // Prompt the user to enter a string
        System.out.println("Enter the String to find its length:");

        // Create a Scanner object to read input from the user
        Scanner scanner1 = new Scanner(System.in);

        // Read the string input from the user
        
        String name = scanner1.next();
        // Reading the user input string using scanner.next()
        // - Returns: A String entered by the user

        // Apply the function to compute the length of the input string
        int length = stringLenFun.apply(name);
        // Applying the function using apply() method
        // - Parameter: name (a String value entered by the user)
        // - Returns: The length of the input string (an Integer value)

        // Print the result
        System.out.println("Length of given string '" + name + "' is " + length);
        // Printing the result of string length computation
        // Outputs: Length of given string 'name' is length
        
    }
}

