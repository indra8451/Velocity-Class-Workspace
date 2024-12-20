package com.interview.programs_onString;

import java.util.Scanner;

public class FindWordInString {

	public static void main(String[] args) {


		System.out.println("Enter the String :- ");
		Scanner scanner= new Scanner(System.in);
		String str= scanner.nextLine();
		
		System.out.println("Enter the word to find :- ");
		String word= scanner.next();
		boolean flag=false;
		String arr[]=str.split("\\s");
			
				
			
				for(int i=0;i<arr.length;i++)
				{
					if (arr[i].equals(word)) {
						
						flag=true;
						
					} 
					
				}
				
				if(flag==true)
				{
					System.out.println("Given the word present is string");
				}
				else
					
				{
					
					System.out.println("Not found");
				}
				
//				for(String name:arr)
//				{
//					System.out.println(name);
//				}
			
	}

}
