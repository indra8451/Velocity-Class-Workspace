package Assignments_7;

import java.util.Scanner;

/**
 * This class calculates the cube of a given number.
 */
public class Cube {
    
    
    public  long cube(long value) {
    	
    	 
        return (value * value * value);  // Calculates and returns the cube of 'value'
    }

  
    public static void main(String[] args) {
       
    	Cube cb=new Cube();
    	
    	System.out.println("Enter the number");  // Prompting user to enter a number
        
        Scanner sobj = new Scanner(System.in);  // Creating a Scanner object to read input
        long input = sobj.nextLong();  // Reading the input number
        long cubedValue =cb.cube(input);
        System.out.println("Cube of given number is: " + cubedValue);  // Displaying the cube of the input number

    	
    }

}
