package com.interview.programs_onString;

import java.util.Scanner;

public class LongestWordInString {

	public String longestWord()
	{
		System.out.println("Enter the String:-");
		Scanner scanner = new Scanner(System.in);
		String line=scanner.nextLine();
		
		String arr[]=line.split(" ");
		String longword=" ";
		
		for(String word:arr)
		{
			if(word.length()>longword.length())
			{
				
				longword=word;
			}
			
		}
		
		
		return longword;
	}
	
	public static void main(String[] args) {
		
		LongestWordInString longest= new LongestWordInString();
		String word=longest.longestWord();
		System.out.println("longest word in the string is:-"+word);
		
	}

}
