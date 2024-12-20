package com.interview.OnNumber.practice.program;

import java.util.Scanner;

public class SumofEvenNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter the no");
		Scanner sobj= new Scanner(System.in);
		int no= sobj.nextInt();
		int rem=0;
		//int sum=1;
		int sum=0; 
		while(no!=0)
		{
			rem=no%10;
			if(rem%2==0)
			{
				sum=sum+rem;
				//sum=sum+rem;  for multiplication
			}
			
			no=no/10;
		}
		
		System.out.println("sum of even number from given number :"+sum);
	}

}
