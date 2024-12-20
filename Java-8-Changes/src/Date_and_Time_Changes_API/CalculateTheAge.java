package Date_and_Time_Changes_API;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculateTheAge {

    public static void main(String[] args) {
        
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter their birth date
        System.out.println("Enter the BirthDate (YYYY-MM-DD): ");
        
        // Read the birth date as a String input
        String birthDateInString = scanner.nextLine();
        
        // Parse the String input into a LocalDate object
        LocalDate birthDate = LocalDate.parse(birthDateInString);
        
        // Getting the current date
        LocalDate currentDate = LocalDate.now();
        
        // Calculate the difference between the current date and birth date
        Period age = Period.between(birthDate, currentDate);
        
        // Output the age in years
        System.out.println("You are " + age.getYears() + " years old");
        
        // Display additional information about the age
        System.out.println("####### We can fetch year, month, and day also #########");
        System.out.println("Days: " + age.getDays());   // Output the number of days in the last year
        System.out.println("Months: " + age.getMonths()); // Output the number of months in the last year
        System.out.println("Years: " + age.getYears());   // Output the total number of years

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
