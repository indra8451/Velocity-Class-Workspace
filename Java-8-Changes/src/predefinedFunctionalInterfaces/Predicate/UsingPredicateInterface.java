package predefinedFunctionalInterfaces.Predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class UsingPredicateInterface {

	public static void main(String[] args) {

		System.out.println("Enter the no:- ");
		Scanner scanner = new Scanner(System.in);
		int no = scanner.nextInt();

		Predicate<Integer> predicate = (Integer a) -> {

			return (a > 10);

		};

		/*
		 * If there’s only one input argument, you can remove the parentheses means (),
		 * and if there’s only one return statement, We can remove the curly braces
		 * means {} and return keyword as well. Here's the rewritten code:
		 * 
		 */

		// Predicate<Integer> predicate= a->a>10;

		boolean flag = predicate.test(no);

		if (flag == true) {

			System.out.println("given no is greater than 10");
		} else {

			System.out.println("given no is smaller than 10");
		}
		scanner.close();
	}

}
