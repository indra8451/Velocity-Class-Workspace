package com.interview.programs_onString;

import java.util.Scanner;

public class VowelsCount {
	
	public static int vowelscount(String str)
	{
		char arr[]= {'a','e','i','o','u'};
		int count=0;
		for(int i=0;i<str.length()-1;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(str.charAt(i)==arr[j])
				{
					count++;
				}
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		
		//VowelsCount vowelscount= new VowelsCount();
			System.out.println("Enter the String :- ");
			Scanner scanner= new Scanner(System.in);
			
			String word= scanner.nextLine();
			
			int count=vowelscount(word);
			System.out.println("Count of the Number of Vowels in a String "+ count);

	}

}
