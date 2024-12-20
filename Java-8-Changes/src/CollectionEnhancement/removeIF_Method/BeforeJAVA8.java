package CollectionEnhancement.removeIF_Method;

import java.util.ArrayList;
import java.util.List;

// Demonstrating removal methods before Java 8
public class BeforeJAVA8 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("pune");
        list.add("mumbai");
        list.add("bangalore");
        list.add("delhi");
        list.add("chennai");
        list.add("hyderabad");
        list.add("kolkata");
        list.add("ahmedabad");
        list.add("jaipur");
        list.add("lucknow");

        // Original list
        System.out.println("################### Original List: ####################################");
        System.out.println(list);
        
        // Remove element at index 2
        System.out.println("\n################### remove(int index) method ####################################");
        String removedString = list.remove(2);
        System.out.println("Removed element at index 2: " + removedString);
        System.out.println("Updated List: " + list);
        
        // Remove element by object
        System.out.println("\n################### remove(Object o) method ####################################");
        boolean flag = list.remove("delhi");
        System.out.println("Is 'delhi' removed? " + (flag ? "Yes" : "No"));
        System.out.println("Updated List: " + list);

        // Requirement: Check if an element exists, then remove it
        System.out.println("\n#### Requirement: Check if an element exists, then remove it ########");
        
        // Using for-each loop to remove 'jaipur'
        System.out.println("############## Removing 'jaipur' using for-each loop: #######################");
        for (String city : list) {
            if (city.equals("jaipur")) {
                list.remove(city); // Remove 'jaipur'
            }
        }
        System.out.println("Updated List after attempting to remove 'jaipur': " + list);

        // Using for loop to remove 'kolkata'
        System.out.println("\n############################ Removing 'kolkata' using for loop: ###################");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("kolkata")) {
                list.remove(i);
                System.out.println("Removed 'kolkata'. Updated List: " + list);
            }
        }

        // Final list after all removals
        System.out.println("\n######################### Final List after all removals: ########################");
        System.out.println(list);
    }
}
