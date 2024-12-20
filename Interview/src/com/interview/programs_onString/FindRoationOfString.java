package com.interview.programs_onString;

import java.util.Scanner;

public class FindRoationOfString {

	public static void main(String[] args) {
		
		System.out.println("Enter the String ");
		Scanner scanner=new Scanner(System.in);
		
		String word=scanner.next();
		
		String wholeString=word+word;
		int index=0,j=0;
		//System.out.println(wholeString);
		
		for(int i=0;i<word.length()-1;i++)
		{
			for( j=j+1;j<wholeString.length()-1;j++)
			{
				if(word.charAt(i)==wholeString.charAt(j))
				{
					index=j-1;
					continue;
				}
			}
		}
		
		System.out.println("Starting index of roation String "+ index);

	}

}
