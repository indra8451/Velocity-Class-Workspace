package OutputFileProgram;
import java.util.Scanner;

/*Program for reverse string*/

public class ReverseString {

	public static void main(String[] args) {
		
		System.out.println("Enter the String:-");
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		String reverse="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			
			 reverse=reverse+str.charAt(i);
		}
		
		System.out.println("Reverse String :"+ reverse);
	}

}
