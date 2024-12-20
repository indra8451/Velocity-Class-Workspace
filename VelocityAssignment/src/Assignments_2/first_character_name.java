package Assignments_2;

import java.util.Scanner;

// Write the java program to print first character of your name on console. 

public class first_character_name {
	
	public static void main(String args[])
	{
		
	System.out.println("Enter your first name:- ");	
		
	Scanner sobj=new Scanner(System.in);
	
	String str=sobj.next();
	
	char ch=str.charAt(0);
	
	System.out.println("first character of your name :- " + ch);

	}
}
