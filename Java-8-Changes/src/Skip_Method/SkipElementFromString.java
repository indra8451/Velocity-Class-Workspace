package Skip_Method;

import java.util.ArrayList;
import java.util.List;

public class SkipElementFromString {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("kailsh");
		list.add("vikas");
		list.add("yogesh");
		list.add("karan");
		list.add("rahul");
		
		list.stream().skip(2).forEach(name->System.out.println(name));

	}

}
