package Assigment_10;

import java.util.Scanner;

/*
 1. Write Java program to check whether number is prime or not. ( Prime means  a number which is divisible by only two numbers: 1 and itself. 
    So, if any number is divisible by any other number, it is not a prime number.)
 */

public class PrimeNumber {

	public void primeNumber() {
		
		System.out.println("Enter the number");
		
		Scanner sobj=new Scanner(System.in);
		
		int num=sobj.nextInt();
		
		boolean flag=false;
		
		for(int i=2;i<=num/2;i++)
		{
			
			if(num%i==0)
			{
				flag=true;
			}
			
		}
		
		if(flag==true)
		{
			System.out.println("given Number is not prime no");
			
		}
		else
		{
			System.out.println("given Number is  prime no");
			
		}
				
		
	}
	
	
	public static void main(String[] args) {
		
		PrimeNumber pn=new PrimeNumber();
		pn.primeNumber();

	}

}
