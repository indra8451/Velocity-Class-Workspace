package com.interview.lambdaExpression.PredicateFunctionalInterface;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicatFunctionalInterfaceForPrimitiveDataType {

	public static void main(String[] args) {

		System.out.println("Ex 1 Enter the number to check if it is greater than 10 or not");
		Scanner scanner = new Scanner(System.in);

		int data = scanner.nextInt();

		Predicate<Integer> p = no -> no > 10;

		boolean flag = p.test(data);

		if (flag == true) {
			System.out.println("Number is greater");
		} else {
			System.out.println("Number is smaller");
		}

		// Example 2 :check length of string is greater than 4 or not

		System.out.println("Enter the string to check if the length of the string is greater than 4 or not");
		String name = scanner.next();

		Predicate<String> p2 = s -> s.length() > 4;

		boolean check = p2.test(name);

		if (check == true) {
			System.out.println("String length is greater than 4");
		} else {
			System.out.println("String length is 4 or less");
		}

		String names[] = { "Indrajit", "inda", "visha", "vinayak", "kivi" };

		for (String name1 : names) {
			if (p2.test(name1)) {

				System.out.println("String length is greater than 4:- " + name1);
			}
		}
		scanner.close();

	}
}
