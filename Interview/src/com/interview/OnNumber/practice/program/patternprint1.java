package com.interview.OnNumber.practice.program;

import java.util.Scanner;

public class patternprint1 {

	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner sobj= new Scanner(System.in);
		int no= sobj.nextInt();
		int i=1;
		char ch='A';
		while(i!=no)
		{
			if(no%i==0)
			{
				System.out.print(" "+i+ch);
				ch++;
				
			}
			
			i++;
		}
	}

}
