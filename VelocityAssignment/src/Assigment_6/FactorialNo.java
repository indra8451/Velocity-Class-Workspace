package Assigment_6;

import java.util.Scanner;

public class FactorialNo {

	public static void main(String[] args) {

			
		System.out.println("Enter the no");
		
		Scanner sobj=new Scanner(System.in);
		
		int num=sobj.nextInt();
		int sum=1;
		
		while(num!=0)
		{
			
			sum=sum*num;
			num--;
			
		}
		System.out.println("Factorial no"+ " "+sum);
	}

}
