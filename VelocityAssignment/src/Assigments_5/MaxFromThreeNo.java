package Assigments_5;

import java.util.Scanner;

public class MaxFromThreeNo {

	public static void main(String[] args) {
		
		Scanner sobj= new Scanner(System.in);
		
		System.out.println("Enter the 1st aber");
		 int a=sobj.nextInt();
		 
		 System.out.println("Enter the 2nd aber");
		 int b=sobj.nextInt();
		 
		 System.out.println("Enter the 3rd aber");
		 int c=sobj.nextInt();
		 
		 if(a>b && a>c)
		 {
			System.out.println("1st Number is greater"+ " "+a);
		 }
		 else if(b>a && b>c)
		 {
			 System.out.println("2nd Number is greater"+ " "+b);
		 }
		 else
		 {
			 System.out.println("3rd Number is greater"+ " "+c);
		 }

	}

}
