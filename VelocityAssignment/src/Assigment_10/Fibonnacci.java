package Assigment_10;

import java.util.Scanner;

/*
 
 2. Write a java program to display the Fibonacci series up to given number. 
     (Fibonacci series mean next number is the sum of previous two numbers for example 0,1,1,2,3,5,8,13,21,34,55 etc. 
    If enter no as 5 then output is 0,1,1,2,3).
 */

public class  Fibonnacci {

	public void FibonacciNumber()
	{
		  System.out.println("Enter the number");
			
			Scanner sobj=new Scanner(System.in);
			
			int num=sobj.nextInt();
			
			int a=0;
			int b=1;
			int c=0;
			System.out.print(" "+a);
			System.out.print(" "+b);
			for(int i=2;i<num;i++)
			{
				c=a+b;
				System.out.print(" "+c);
				a=b;
				b=c;
					
			}		
			
	}
	
	public static void main(String[] args) {
		Fibonnacci fi = new Fibonnacci();
		fi.FibonacciNumber();
     
}
	}
