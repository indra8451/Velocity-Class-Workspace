package Assigment16.program;

import java.util.Scanner;

public class MainProduct {

	public static void main(String[] args) {
		
		System.out.println("Enter the Weight:-");
		Scanner scanner= new Scanner(System.in);
		int weight= scanner.nextInt();
		
		try {
			if(weight<Product.getWeight())
			{
				throw new ProductException("Weight must be Greater than 100");
			}
			
		} catch (ProductException e) {
			
		//	System.out.println(e);
			e.printStackTrace();
		}
		

	}

}
