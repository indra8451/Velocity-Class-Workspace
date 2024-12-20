package com.interview.programs_onString;

import java.util.Scanner;

public class StringReverseWithoutArray {

	public static void main(String[] args) {


		System.out.println("Enter the String :- ");
		Scanner scanner= new Scanner(System.in);
		
		String word= scanner.next();
		String Reversed_String="";
		
	/*  
	 *  Q.1  StringReverseWithoutArray using charAt(i) method
	 * 
	 	for(int i= word.length()-1;i>=0;i--)
	 
		{
			
			 Reversed_String=Reversed_String+word.charAt(i);
		}
		
		System.out.println("Reversed word "+Reversed_String);

	
	*/

		
		
		/*
		 * 
		 *  Q.2  Let's see a simple example where we are accessing first and last character from the provided string.
		 *   
		 *      int StartIndex=0;
				int LastIndex=word.length();
				System.out.println(LastIndex-1);
				
				char ch = word.charAt(StartIndex);
				System.out.println("first character from the provided string "+ ch);
				
				char ch1 = word.charAt(LastIndex-1);
				System.out.println("first character from the provided string "+ ch1);
		 */
		
		
		/*
		 *   Q.3 Print Characters Presented at Odd Positions by Using the charAt() Method
		 *   
		 *   
		 
		
		     for(int i=0;i<word.length();i++)
		     {
		    	 if(i%2!=0)
		    	 {
		    		 System.out.println("Odd Positions of  Characters "+ word.charAt(i));
		    		 
		    	 }
		     }
		
		*/
		
		/*
		 * Q.4 Counting Frequency of a character in a String
		 * 
		 */
		
			System.out.println("Enter the character to find the Count");
		    char ch = scanner.next().charAt(0);
		    int count=0;
		    for(int i=0;i< word.length();i++)
		    {
		    	if(ch==word.charAt(i))
		    	{
		    		count++;
		    	}
		    }
		    
		    System.out.println("Frequency of character " + ch +" is "+ count);
	}
}
