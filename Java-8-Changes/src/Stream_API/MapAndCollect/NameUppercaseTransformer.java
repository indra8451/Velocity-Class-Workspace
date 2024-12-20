package Stream_API.MapAndCollect;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NameUppercaseTransformer {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("kailash");
		list.add("vikas");
		list.add("yogesh");
		list.add("karan");
		list.add("rahul");

		System.out.println("Before transforming: ");
		System.out.println(list);
		
		List<String> listOfTransformedName=list.stream().map((name)->{
			
			return name.toUpperCase();
			
		}).collect(Collectors.toList());

		System.out.println("\nAfter transforming: ");
		
		System.out.println(listOfTransformedName);
	}

}
