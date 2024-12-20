package CollectionEnhancement.filter_Method;

import java.util.ArrayList;
import java.util.List;

public class SortingListWithoutFilterMethod {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("kailash");
		list.add("vikas");
		list.add("yogesh");
		list.add("karan");
		list.add("rahul");

		for (String name : list) {

			if (name.startsWith("k")) {

				System.out.println(name);
			}
		}
	}
}
