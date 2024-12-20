package Assigment_11;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the Number");
		
		Scanner sobj= new Scanner(System.in);
		
		int num=sobj.nextInt();
		int Original_no=num;
		int rem=0;
		int sum=0;
		while(num!=0)
		{
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
				
			
		}
		System.out.println(sum);
		
		if(Original_no==sum)
		{
			System.out.println("palidrom");
		}
		else
		{
			System.out.println("not palindrome");
		}
			
		
	}

}
