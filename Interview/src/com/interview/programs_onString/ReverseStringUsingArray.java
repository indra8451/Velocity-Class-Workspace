package com.interview.programs_onString;

import java.util.Scanner;

public class ReverseStringUsingArray {

	public static void main(String[] args) {
	
		
		System.out.println("Enter the String for reveserse :- ");
		Scanner scanner= new Scanner(System.in);
		
		String word= scanner.next();
		
		int StartIndex=0;
		int LastInsex=word.length()-1;
	    char arr[]=word.toCharArray();
	
			while(StartIndex<LastInsex)
			{
				char ch=arr[StartIndex];
				arr[StartIndex]=arr[LastInsex];
				arr[LastInsex]=ch;
				
				StartIndex++;
				LastInsex--;
				
			}
			
		 word = new String(arr);
		System.out.println("Reversed String is "+ word);

	}

}
