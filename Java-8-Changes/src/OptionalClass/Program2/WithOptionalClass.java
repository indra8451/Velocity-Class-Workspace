package OptionalClass.Program2;

import java.util.List;
import java.util.Optional;

public class WithOptionalClass {

	public static Optional<List<String>> x1() {

		return Optional.ofNullable(null);
	}

	public static void main(String[] args) {

		Optional<List<String>> list = x1();

		list.ifPresent(list1 -> {

			List<String> optionalList = list.get();
			System.out.println(optionalList);

		});

		if (list.isPresent()) {

			System.out.println("List is Not null");

		} else {

			System.out.println("List is  null");
		}
	}
}
