package Assigments22;

import java.util.Comparator;
import java.util.Map.Entry;

public class SortValComaparator implements Comparator<Entry<String, Integer>> {

	@Override
	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
		
		return Integer.compare(o1.getValue(), o2.getValue());// ascending order
		//return Integer.compare(o2.getValue(), o1.getValue());// descending order
	}

	

}
