package CollectionEnhancement.forEach_Method;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Class to demonstrate methods for printing collections before Java 8
public class BeforeJAVA8 {

    // Method to print elements using the size() method
    public void sizeMethod(List<String> list) {
        System.out.println("############################## Using size() Method ###########################");
        // Loop through the list using its size
        for (int i = 0; i < list.size(); i++) {
            // Get the element at index i
            String a = list.get(i);
            // Print the element
            System.out.println(a);
        }
    }

    // Method to print elements using a for-each loop
    public void forEachLoop(List<String> list) {
        System.out.println("###################### Using for-each loop ###################################");
        // Iterate through the list using for-each loop
        for (String city : list) {
            // Print each city
            System.out.println(city);
        }
    }

    // Method to print elements using an Iterator
    public void iterator(List<String> list) {
        System.out.println("######################## Using Iterator ##################################");
        // Get an iterator for the list
        Iterator<String> iterator = list.iterator();

        // Iterate through the list using the iterator
        while (iterator.hasNext()) {
            // Get the next element
            String name = iterator.next();
            // Print the current element
            System.out.println(name);
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Create an instance of BeforeJAVA8
        BeforeJAVA8 beforeJAVA8 = new BeforeJAVA8();

        // Create a list of cities
        List<String> list = new ArrayList<String>();
        list.add("Pune");
        list.add("Mumbai");
        list.add("Bangalore");
        list.add("Delhi");

        // Call the methods to print the list using different approaches
        beforeJAVA8.sizeMethod(list);
        beforeJAVA8.forEachLoop(list);
        beforeJAVA8.iterator(list);
    }
}
