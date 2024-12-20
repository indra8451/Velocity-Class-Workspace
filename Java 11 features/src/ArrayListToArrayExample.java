import java.util.ArrayList;
import java.util.List;

public class ArrayListToArrayExample {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Indrajit");
		names.add("Prazzakta");
		names.add("Chavan");

		// Print the ArrayList
		System.out.println("ArrayList: " + names);

		// Convert ArrayList to Array using the old toArray method
		Object[] oldArray = names.toArray();
		System.out.println("Old method toArray output: ");
		for (Object name : oldArray) {
			System.out.println(name);
		}

		// Convert ArrayList to Array using the Java 11 toArray method (Method
		// reference)
		String[] newArray = names.toArray(String[]::new);
		System.out.println("New method toArray output Using Method reference: ");
		for (String name : newArray) {
			System.out.println(name);
		}

		String[] newArray2 = names.toArray(size -> new String[size]);
		System.out.println("New method toArray output Ussing lambda expression: ");
		for (String name : newArray2) {
			System.out.println(name);
		}
	}
}
