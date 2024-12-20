package Assigments_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class If_Else 
{

	public static void main(String[] args)
	{
		Scanner sobj =new Scanner(System.in); 
		
		
		try {
			
			System.out.print("Enter the percentage to see the class:- ");
			
			int input=sobj.nextInt();
				
			
		if(input>100)
			{
				System.out.println("Invalid Input");
			}
		else if (input>=60)
		{
			System.out.println("Congratualtions You got First class");
		}
		else if(input<60 && input >=55)
		{
			System.out.println("Congratualtions You got Second class");

		}
		else if(input >=35 && input<55)
		{
			System.out.println("Congratulations You are pass");

		}
		else
		{
			System.out.println("Failed !!!!!Try luck next time55");

		}
	    }
	
		catch (InputMismatchException e) 
		{
			System.out.println("input must in integer");
		}
		
		finally 
		{
			
			sobj.close();
		} 

}

}