package Assignments_2;

//Write the java program to print the global variable value as 25.

public class global_variable
{ // Define a public class named global_variable

    // Declare an instance variable 'a1' and initialize it with the value 35
    int a1 = 35;

    // Declare an instance variable 'b' without initialization (default value is 0 for int)
    int b;

    public static void main(String args[])
    { // Define the main method, which is the entry point of the program
    	
        // Create an instance of the global_variable class
        global_variable gb = new global_variable();

        // Print the value of the instance variable 'a1' using the instance 'gb'
        System.out.println("The value of a=" + gb.a1);

        // Print the value of the instance variable 'b' using the instance 'gb'
        System.out.println("The value of b=" + gb.b);   // 0 by default global variable value
    }
}
