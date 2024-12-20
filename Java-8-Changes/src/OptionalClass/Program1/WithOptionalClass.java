package OptionalClass.Program1;

import java.util.Optional;

public class WithOptionalClass {

	public static void main(String[] args) {
		String name = null;

		Optional<String> optionalName = Optional.ofNullable(name);

		if (optionalName.isPresent()) {
			
			System.out.println("Name is not null");
			
		} else {
			
			System.out.println("Name is  null");
		}
	}

}
