package CollectionEnhancement.filter_Method;

import java.util.ArrayList;
import java.util.List;

public class SortingListWithUsingFilterMethod {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();

		list.add("kailash");
		list.add("vikas");
		list.add("yogesh");
		list.add("karan");
		list.add("rahul");

		System.out.println("Using method reference");
		list.stream().filter(name->name.startsWith("k")).forEach(System.out::println);// using method reference
		
		System.out.println("\nUsing lambda expression");
		list.stream().filter(name->name.startsWith("k")).forEach(name->System.out.println(name)); //using lambda expression
	}

}
