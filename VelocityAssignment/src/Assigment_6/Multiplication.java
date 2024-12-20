package Assigment_6;

import java.util.Scanner;

/*
 2. Design method void multiplication (int no) and print the .
  ( Example enter the no=5 then output like 
5*1=5.......5*10=50

 */


public class Multiplication {

	public void multiplication (int no) 
	{
		System.out.println("Multilication Table of "+no);
		for(int i=1;i<=10;i++)
		{
			int value=0;
			  value=no*i;
			 System.out.println(value);
		}
		
	}
	
	
	public static void main(String[] args)
	{
		Multiplication mul= new Multiplication();
		System.out.println("Enter the Number");
		Scanner sobj= new Scanner(System.in);
		int num= sobj.nextInt();
		mul.multiplication(num);
		
	}

}
