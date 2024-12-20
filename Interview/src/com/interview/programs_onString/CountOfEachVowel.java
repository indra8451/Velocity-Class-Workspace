package com.interview.programs_onString;

import java.util.Scanner;

public class CountOfEachVowel {

	public static void main(String[] args) {
	
		
		System.out.println("Enter the String :- ");
		Scanner scanner= new Scanner(System.in);
		
		String word= scanner.nextLine();
		
		int arr[]=new int[5];
	//	char charr[]={'a','e','i','o','u'};
		
		for(int i=0;i<word.length();i++)
		{
			char ch=word.toLowerCase().charAt(i);
			
			switch (ch) {
			case 'a':
				 arr[0]++;
				break;
			case 'e':
				 arr[1]++;
				break;
			case 'i':
				 arr[2]++;
				break;
			case 'o':
				 arr[3]++;
				break;
			case 'u':
				 arr[4]++;
				break;
			}
			
		}

//		for(int i=0;i<charr.length;i++)
//		{
//			System.out.println("Count for Vowel "+charr[i]+" is "+arr[i]);
//		}
		
		System.out.println("Count for Vowel a " +" is "+arr[0]);
		System.out.println("Count for Vowel e " +" is "+arr[1]);
		System.out.println("Count for Vowel i " +" is "+arr[2]);
		System.out.println("Count for Vowel o " +" is "+arr[3]);
		System.out.println("Count for Vowel u " +" is "+arr[4]);
		
	}

}
