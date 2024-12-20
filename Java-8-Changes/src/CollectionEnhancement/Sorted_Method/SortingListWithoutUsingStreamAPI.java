package CollectionEnhancement.Sorted_Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingListWithoutUsingStreamAPI {

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

		Collections.sort(numList);
		System.out.println("After sorting-Ascending Order>>" + numList); 
		
		Collections.sort(numList,Collections.reverseOrder());
		System.out.println("After sorting-Desending Order>>" + numList);
	}

}
