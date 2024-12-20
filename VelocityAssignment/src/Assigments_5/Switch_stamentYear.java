package Assigments_5;

import java.util.Scanner;

public class Switch_stamentYear {
	
	public static void main(String args[])
	{
		
		System.out.println("Enter the Month:- ");
		Scanner sobj = new Scanner(System.in);
		
		int input= sobj.nextInt();
		
		switch (input) 
		{
		case 1: 
			System.out.println("Jan");
			break;
			
		case 2:
			System.out.println("Feb");
			break;
			
		case 3:
			System.out.println("March");
			break;
			
		case 4:
			System.out.println("April");
			break;
			
		case 5:
			System.out.println("may");
			break;	
			
		case 6:
			System.out.println("June");
			break;		
			
		case 7: 
			System.out.println("July");
			break;
			
		case 8:
			System.out.println("Aug");
			break;
			
		case 9:
			System.out.println("Sep");
			break;
			
		case 10:
			System.out.println("Oct");
			break;
			
		case 11:
			System.out.println("Nov");
			break;	
			
		case 12:
			System.out.println("Dec");
			break;		
			
		default:
			System.out.println("Invalid Number");
			break;
		}
		
		
	}
}
