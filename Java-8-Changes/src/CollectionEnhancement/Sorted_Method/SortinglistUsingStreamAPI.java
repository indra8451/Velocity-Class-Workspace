package CollectionEnhancement.Sorted_Method;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortinglistUsingStreamAPI {

	public static void main(String[] args) {

		List<Integer> numList = new ArrayList<Integer>();

		numList.add(12);
		numList.add(100);
		numList.add(87);
		numList.add(1);
		numList.add(46);
		numList.add(3);
		numList.add(67);
		numList.add(10);
		numList.add(21);

		System.out.println("After sorting-Ascending Order>>");
		numList.stream().sorted().forEach(num -> System.out.println(num));
		
		System.out.println("After sorting-Desending Order>>");
		numList.stream().sorted(Collections.reverseOrder()).forEach(num -> System.out.println(num));
	}
}
