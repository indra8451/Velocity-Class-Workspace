package OptionalClass.Program1;

public class WithoutOptionalClass {

	public static void main(String[] args) {

		String name = null; // Declaring a null string

		// Attempting to access the length of a null string
		int length = name.length(); // This will throw a NullPointerException

	}

}
