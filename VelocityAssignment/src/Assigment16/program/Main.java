package Assigment16.program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Enter the Weight:-");
		Scanner scanner= new Scanner(System.in);
		int weight= scanner.nextInt();
		
		Product product= new Product();
		product.productCheck(weight);
		
		

	}

}
