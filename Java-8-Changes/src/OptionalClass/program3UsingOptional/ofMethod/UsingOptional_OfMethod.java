package OptionalClass.program3UsingOptional.ofMethod;

import java.util.List;
import java.util.Optional;

public class UsingOptional_OfMethod {

	public static Optional<List<String>> x1() {
		
		// Using Optional.of(null) will throw a NullPointerException because Optional.of() expects a non-null value.
		// Instead, we should use Optional.ofNullable(null) if we want to handle potential null values safely.
		
		return Optional.of(null);
	}

	public static void main(String[] args) {

		Optional<List<String>> list = x1();

		// Inside ifPresent() we use the Consumer functional interface, which accepts one argument, processes it, and does not return a result.
		
		list.ifPresent(list1 -> {
			List<String> optionalList = list.get();
			System.out.println(optionalList);
		});

		// isPresent() checks if a value is present in the Optional. It returns true if a value is present, otherwise false.
		
		if (list.isPresent()) {
			System.out.println("List is Not null");
		} else {
			System.out.println("List is null");
		}
	}
}
