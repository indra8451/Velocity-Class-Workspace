package com.interview.Java8interview_quetions;

import java.util.Arrays;
import java.util.List;

public class vowels_count {

	public static void main(String[] args) {

	/*// normal program 	
		String sobj="tcsinterview";
		
		char arr[]=sobj.toCharArray();
		int count =0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='a' || arr[i]=='e' ||arr[i]=='i' ||arr[i]=='o' ||arr[i]=='u' )
			{
				count++;
			}
		}

		 System.out.println("The vowels count is :- "+ count);  */
		
       // using java 8 features
        
        String sname = "India is my country";
        
        // Convert the string to lowercase
        String sobj = sname.toLowerCase();
        
        // Define a list of vowel characters
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        
        // Count the number of vowels in the string
        long vowelcount = sobj.chars()                // Convert the string to an IntStream of character codes
                              .mapToObj(c -> (char) c) // Convert each character code to a Character object
                              .filter(vowels::contains) // Keep only characters that are in the list of vowels
                              .count();                // Count the remaining characters
        
        // Print the vowel count
        System.out.println("vowel count is:- " + vowelcount);
	}

}
