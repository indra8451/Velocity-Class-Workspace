package predefinedFunctionalInterfaces.Function;

import java.util.Scanner;
import java.util.function.Function;

public class UsingFunctionInterface {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Multiplication operation
		System.out.println("Enter a number to multiply: ");
		int number = scanner.nextInt();

		Function<Integer, Integer> function = num -> num * num; // only one return statement so removing {} bracket

		Integer result = function.apply(number);

		System.out.println("Square of the given number " + number + " is: " + result);

		System.out.println("###############################################################################################");

		// String reversal operation
		// Clear newline left by nextInt()
		scanner.nextLine();

		System.out.println("Enter a string to reverse: ");
		String inputString = scanner.nextLine();

		Function<String, String> function1 = str -> {
			String reversed = " ";
			for (int i = str.length() - 1; i >= 0; i--) {
				reversed += str.charAt(i);
			}
			return reversed;
		};

		String result1 = function1.apply(inputString);
		System.out.println("Reversed string is: " + result1);
		scanner.close();

	}

}
