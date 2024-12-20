package com.interview.lambdaExpression.SupplierFunctionalInterface;

import java.util.Date; // Import the Date class from the java.util package
import java.util.function.Supplier; // Import the Supplier interface from the java.util.function package

public class SupplierUse {

    public static void main(String[] args) {
        
        // Define a Supplier that returns the current date and time
    	
        Supplier<Date> supp = () -> new Date();
        
        // Supplier<Date> means:
        // - The Supplier interface takes no input and returns a result of type Date
        // - In this case, it returns the current date and time using the Date() constructor

        
        // Get the current date and time from the Supplier
        Date date = supp.get();
        // Explanation: The get() method of the Supplier is called to obtain the current date and time
        // - supp.get() creates a new Date object representing the current date and time

        
        // Print the current date and time
        System.out.println(date);
        // Explanation: Prints the Date object, which displays the current date and time in the default format

    }

}
