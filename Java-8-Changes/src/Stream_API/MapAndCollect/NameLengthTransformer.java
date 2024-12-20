package Stream_API.MapAndCollect;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NameLengthTransformer {
	
	public static void main(String[] args) {
		

		List<String> list = new ArrayList<>();

		list.add("kailash");
		list.add("vikas");
		list.add("yogesh");
		list.add("karan");
		list.add("rahul");
		
		
		System.out.println("before transforming: ");
		System.out.println(list);
		List<Integer> lengthlist=list.stream().map(name->name.length()).collect(Collectors.toList());
		
		System.out.println("\nAfter transforming: ");
		System.out.println(lengthlist);
	}

}
