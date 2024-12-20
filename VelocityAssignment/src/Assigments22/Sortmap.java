package Assigments22;
/*1. Suppose I have Map<String,Integer> contain key as Ram, Sohan, Ashok, Ajay, Prasanna and value is 3,2,1,6,5 
   now I want to sort the value from map and print it.*/
import java.util.*;
import java.util.Map.Entry;

public class Sortmap {
	
	public static  void mapPrint(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
	
	public static void main(String[] args) {
		
		Map<String, Integer> map=new HashMap<String, Integer>();
		
		System.out.println("Enter the Count: ");
		Scanner scanner= new Scanner(System.in);
		int cnt=scanner.nextInt();
		
		for(int i=0;i<cnt;i++) {
			System.out.println("Enter Key: ");
			String key=scanner.next();
			System.out.println("Enter Value: ");
			int value=scanner.nextInt();
			map.put(key, value);
		}
		
		System.out.println(">>>>>>>>>>>>>>>>>Before Sorting<<<<<<<<<<<<<<<<<<<<<<<<<");
		mapPrint(map);
		
		// Get the set of entries from the map
        Set<Entry<String, Integer>> entry = map.entrySet();
		
        // Convert the set of entries to an ArrayList
        ArrayList<Entry<String, Integer>> arrlist = new ArrayList<Entry<String, Integer>>(entry);
		
        // Sort the ArrayList using a custom comparator (SortValComparator)
        Collections.sort(arrlist, new SortValComaparator());
		
        // Create a LinkedHashMap to maintain the insertion order of sorted entries
        LinkedHashMap<String, Integer> sortedhashmap = new LinkedHashMap<>();
		
        // Add the sorted entries to the LinkedHashMap
        for (Entry<String, Integer> entry1 : arrlist) {
            sortedhashmap.put(entry1.getKey(), entry1.getValue());
        }
		System.out.println(">>>>>>>>>>>>>>>>>After Sorting<<<<<<<<<<<<<<<<<<<<<<<<<<");
		mapPrint(sortedhashmap);
	}

}
