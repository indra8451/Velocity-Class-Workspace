package Assignments19;

/*1. Design a method for counting the alphabet, vowels and numbers from String. 
Input should be from user into main method and pass that to methods. 
And result will print into main method */


import java.util.Scanner;

public class CountVowelAlphabetNumberFromString {
	
	public  int[] countVowelAlphabetNumberFromstring(String string)
	{
		int arr[]= {0,0,0,0};
		System.out.println(arr.length);
		
		for(int i=0;i<string.length();i++)
		{
			char ch = string.charAt(i);
			
			if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
			{
				arr[0]++;
				//System.out.println(ch);
			}
			 if((ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') ||(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'))
			{
				arr[1]++;
				//System.out.println(ch);
			}
		
			if((ch>=48 && ch<=57))
			{
				arr[2]++;
				//System.out.println(ch);
			}
			
			if(ch==' ')
			{
				arr[3]++;
			}
				
			
		}
		
		return arr;
		
	}
	
	public static void main(String args[])
	{
		CountVowelAlphabetNumberFromString obj= new CountVowelAlphabetNumberFromString();
		System.out.println("Enter the String:-");
		Scanner scanner = new Scanner(System.in);
		String string= scanner.nextLine();
		 
	int arr[]=obj.countVowelAlphabetNumberFromstring(string);
	
	System.out.println("Count of Alphabet in String "+ arr[0]);
	System.out.println("Count of Vowels  in String "+ arr[1]);	
	System.out.println("Count of Numbers  in String "+ arr[2]);	
	System.out.println("Count of Spaces  in String "+ arr[3]);	
		
	}

}
