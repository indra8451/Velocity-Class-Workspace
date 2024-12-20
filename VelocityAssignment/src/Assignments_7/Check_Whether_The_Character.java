package Assignments_7;

import java.util.Scanner;

/*
 * every character has some ascii value

a to z  -> 97 to 122

A to Z   -> 65 to 90

0 to 9  -> 48 to 57

special symbol  33 to 47, 58 to 64, 91 to 96, 123 to 126
 */

public class Check_Whether_The_Character {
	
	public void getCharacterType(int ch)
	{
		
		 // Checking the type of input character
        if ((ch >= 97 && ch <= 122) ||  (ch >= 65 && ch <= 90))
        {
            System.out.println("Given input is Character");
            
        } else if (ch >= 48 && ch <= 57) 
        {
            System.out.println("Given input is digit");
            
        } else if ((ch>= 33 && ch<=47) ||(ch>= 58 && ch<=64) || (ch>=91 && ch<=96)|| (ch>=123 && ch<=126) ) 
		{
            System.out.println("Given input is Special symbol");
        } else {
            System.out.println("Invalid input");
        }
	}

	

	public static void main(String[] args)
	{
		
		Check_Whether_The_Character cwtc= new Check_Whether_The_Character();
		// Prompting user to enter a character
        System.out.println("Enter the Character");

        // Creating a Scanner object to read input from the user
        Scanner sobj = new Scanner(System.in);

        // Reading the input character
       int ch = sobj.next().charAt(0);
        System.out.println(ch);
        cwtc.getCharacterType(ch);
       
}
}
