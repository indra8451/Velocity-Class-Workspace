package inteviewpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(20, "Indrajit");
		map.put(100, "vishal");
		map.put(50, "kiran");
		map.put(3, "jivan");
		
		Set<Entry<Integer, String>> entry=map.entrySet();

		
		
		System.out.println("Before Sorting:~~~~~~~~~~~~~~~~~~~~");
		map.forEach((k, v) -> System.out.println("key " + k + " value " + v)

		);

		ArrayList<Entry<Integer, String>> arr= new ArrayList<Entry<Integer, String>>(entry);
		Collections.sort(arr,new Sortval());
		
		LinkedHashMap<Integer, String> sortedmap= new LinkedHashMap<>();
		
		for(Entry<Integer, String> entry1:arr) {
			
			sortedmap.put(entry1.getKey(), entry1.getValue());
		}
		
		System.out.println("after Sorting:~~~~~~~~~~~~~~~~~~~~");
		sortedmap.forEach((k, v) -> System.out.println("key " + k + " value " + v)

		);

	}
}
