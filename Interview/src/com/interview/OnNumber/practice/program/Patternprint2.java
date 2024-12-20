package com.interview.OnNumber.practice.program;

import java.util.Scanner;

public class Patternprint2 {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sobj= new Scanner(System.in);
		int no= sobj.nextInt();
		char ch='A';
		int count=1;
		for(int i=0;i<no;i++)
		{
			if(i%2==0){
				System.out.print(ch+" "+" "+Character.toLowerCase(ch));
				ch++;
				
				
			}
				
			
			
		}

	}

}
