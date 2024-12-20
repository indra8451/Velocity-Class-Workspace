package com.interview.OnNumber.practice.program;

import java.util.Scanner;

public class MaxDigitCount {

	public static void main(String[] args) {
		
		System.out.println("Enter the no");
		Scanner sobj= new Scanner(System.in);
		int no= sobj.nextInt();
		int rem=0,rem1=0,maxCount=0,Digit=0,count=0;;
		int num=no; 
		int finalno=no;
		while(no!=0)
		{
			
			rem=no%10;
			//System.out.println(rem);
			num=finalno;
			count=0;
			while(num!=0)
			{
				rem1=num%10;
				
				if(rem==rem1)
				
				{
					
					count++;
					
				}
				
				num=num/10;
			}
			
			if(maxCount<count)
			{
				maxCount=count;
				Digit=rem;
				//System.out.println(maxCount);
			}
			
			no=no/10;
		}
		
		System.out.println("digit is "+ Digit +" Maxcount is "+maxCount);
	}

}
