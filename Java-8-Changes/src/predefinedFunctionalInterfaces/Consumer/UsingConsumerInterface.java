package predefinedFunctionalInterfaces.Consumer;

import java.util.Scanner;
import java.util.function.Consumer;

public class UsingConsumerInterface {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Multiplication operation
		System.out.println("Enter a number to multiply: ");
		int number = scanner.nextInt();

		Consumer<Integer> consumer = (num) -> {

			System.out.println("Square of the given number " + num + " is: " + (num * num));
		};

		consumer.accept(number);

		System.out.println("###############################################################################################");

		// String reversal operation
		// Clear newline left by nextInt()
		scanner.nextLine();

		System.out.println("Enter a string to reverse: ");
		String inputString = scanner.nextLine();

		Consumer<String> consumer1 = str -> {
			String reversed = " ";
			for (int i = str.length() - 1; i >= 0; i--) {
				reversed += str.charAt(i);
			}
			System.out.println("Reversed string is: " + reversed);
		};

		consumer1.accept(inputString);

		scanner.close();

	}

}
