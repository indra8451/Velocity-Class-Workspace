package Assigments_5;

import java.util.Scanner;

public class NegativeOrPositiveNo {
	
	public static void main(String args[])
	{
		System.out.println("Enter the Number");
		Scanner sobj = new Scanner(System.in);
		
		int num=sobj.nextInt();
		
		
		if(num>0)
		{
			System.out.println("Positive number");
		}
		else if(num<0)
		{
			System.out.println("Negative Number");
		}
		else
		{
			System.out.println("Zero");
		}
		
	}

}
