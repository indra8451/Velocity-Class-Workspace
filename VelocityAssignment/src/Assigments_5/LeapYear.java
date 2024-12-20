package Assigments_5;

import java.util.Scanner;

// write a program  to check whether  year is leap year or not. (If else stmt).
public class LeapYear {

	public static void main(String[] args) {
		
		System.out.println("Enter the year");
		
		Scanner sobj= new Scanner(System.in);
		int year= sobj.nextInt();
		
		if(year%4==0)
		{
			System.out.println("The Year"+ " "+year+" " +"is leap year");
		}
		else
		{
			System.out.println("The Year"+ " "+year+" " +"is not leap year");
		}

	}

}
