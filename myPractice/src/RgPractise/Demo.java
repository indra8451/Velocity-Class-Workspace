package RgPractise;

import java.util.Scanner;  // Import the Scanner class for user input

//Define the public class Demo
public class Demo {
 
 // Declare instance variables
 String name;
 int id;
 
 // Default constructor
 public Demo() {
     System.out.println("Hello");  // Print a greeting message
 }
 
 // Parameterized constructor
 public Demo(String word, int no) {
     this();  // Call the default constructor
     this.name = word;  // Assign the parameter word to the instance variable name
     this.id = no;  // Assign the parameter no to the instance variable id
 }
 
 // Method to print employee details
 public void print() {
     System.out.println("Employee name: " + name);  // Print the employee name
     System.out.println("Employee id: " + id);  // Print the employee id
 }
 
 // Main method to run the application
 public static void main(String[] args) {
     // Prompt the user to enter a name
     System.out.println("Enter name: ");
     Scanner scanner = new Scanner(System.in);  // Create a Scanner object for user input
     
     // Read the name and id from user input
     String name = scanner.next();  // Read the next word input as the name
     int id = scanner.nextInt();  // Read the next integer input as the id
     
     // Create a new Demo object using the parameterized constructor
     Demo demo1 = new Demo(name, id);
     
     // Call the print method to display the employee details
     demo1.print();
     
     // Close the scanner
     scanner.close();
 }
}

