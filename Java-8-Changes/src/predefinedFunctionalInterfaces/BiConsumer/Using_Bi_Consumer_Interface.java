package predefinedFunctionalInterfaces.BiConsumer;

import java.util.function.BiConsumer;

public class Using_Bi_Consumer_Interface {

	public static void main(String[] args) {

		BiConsumer<String, Integer> printNameWithAge = (name, age) -> {

			System.out.println(name + " is " + age + " years old.");
		};

		printNameWithAge.accept("Lorenzo", 34); // Lorenzo is 34 years old.

		printNameWithAge.accept("Indrajit", 29); // Indrajit is 29 years old.
	}
}
