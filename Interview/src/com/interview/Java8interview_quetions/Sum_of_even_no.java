package com.interview.Java8interview_quetions;

import java.util.Arrays;
import java.util.List;

public class Sum_of_even_no {
	
	public static void main(String[] args) {
		
	/*	// normal program
		int arr[]= {1,3,6,8,100,7,9};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				sum=sum+arr[i];
				System.out.println("Even no from array:- " + arr[i]);
			}
		}
		
		System.out.println("The sum of even nos :- "+sum);  */
		
		//Using java 8 features
		
		int arr[]= {1,3,6,8,100,7,9};
		
		int sum = Arrays.stream(arr).filter(n -> n%2==0).sum();
		
		System.out.println("The sum of even nos :- "+sum); 
		
		
	}

}
