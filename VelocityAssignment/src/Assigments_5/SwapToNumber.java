package Assigments_5;

import java.util.Scanner;

public class SwapToNumber {
	
	public static void main(String[] args) {
		
		Scanner sobj= new Scanner(System.in);
		
		System.out.println("Enter the 1st aber");
		 int a=sobj.nextInt();
		 
		 System.out.println("Enter the 2nd aber");
		 int b=sobj.nextInt();
		 
         System.out.println("Before swap");
		 
		 System.out.println("1st aber"+ " "+a);
		 System.out.println("2nd aber"+ " "+b);
		 
		 int temp=0;
		 
		 temp=a;
		 a=b;
		 b=temp;
		 
		 System.out.println("After swap");
		 
		 System.out.println("1st aber"+ " "+a);
		 System.out.println("2nd aber"+ " "+b);
		 
	}
	

}
