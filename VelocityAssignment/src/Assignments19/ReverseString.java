package Assignments19;

/*2. Design the java method for String getReverseString(String reverse) and take the input from user into main method and pass to that method. 
Result will print into main method*/

import java.util.*;

public class ReverseString {
	
	public  String getReverseString(String reverse)
	{
		String line="";
		
		for(int i=reverse.length()-1;i>=0;i--)
		{
			line=line+reverse.charAt(i);
		}
		
		return line;
	}

	public static void main(String[] args) {
		
		ReverseString reversestring= new ReverseString();
		
		System.out.println("Enter the String:-");
		Scanner scanner = new Scanner(System.in);
		String string= scanner.nextLine();
		String reverse_string=  reversestring.getReverseString(string);
		System.out.println("Reverse of given String :- "+ " "+reverse_string);

	}

}
