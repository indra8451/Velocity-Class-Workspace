package Method_Referensce.Instance_Method.Using_lambda;

import java.util.Scanner;

import Method_Referensce.Instance_Method.Using_lambda.Addition;
import Method_Referensce.Instance_Method.Using_lambda.AdditionImpl;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input from the user
		System.out.println("Enter the 1st number: ");
		int a = scanner.nextInt();

		System.out.println("Enter the 2nd number: ");
		int b = scanner.nextInt();

		// Creating an instance of AdditionImpl
		AdditionImpl additionImpl = new AdditionImpl();

		// Using a lambda expression to call the add method
		Addition addition = (x, y) -> additionImpl.add(x, y);

		// Calling the add method using the lambda
		addition.add(a, b);

		scanner.close();
	}
}
