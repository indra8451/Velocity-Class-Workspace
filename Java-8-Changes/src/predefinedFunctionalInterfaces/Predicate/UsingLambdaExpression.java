package predefinedFunctionalInterfaces.Predicate;

import java.util.Scanner;

@FunctionalInterface
interface Test {

	public boolean checkNumberIsGreaterThan10OrNot(Integer a);
}

public class UsingLambdaExpression {

	public static void main(String[] args) {

		System.out.println("Enter the no:- ");
		Scanner scanner = new Scanner(System.in);
		int no = scanner.nextInt();

		/*
		   Test test = (Integer a) -> {
		 
		   return (a > 10); 
		  
		    };
		 
		 */
		/*
		  If there’s only one input argument, you can remove the parentheses means (),
		  and if there’s only one return statement, We can remove the curly braces
		  means {} and return keyword as well. Here's the rewritten code:
		 
		 */
		Test test = a -> a > 10;

		boolean flag = test.checkNumberIsGreaterThan10OrNot(no);

		if (flag == true) {

			System.out.println("given no is greater than 10");
		} else {

			System.out.println("given no is smaller than 10");
		}
		scanner.close();
	}

}
