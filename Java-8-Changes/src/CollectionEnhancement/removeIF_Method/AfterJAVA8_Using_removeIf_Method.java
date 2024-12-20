package CollectionEnhancement.removeIF_Method;
import java.util.ArrayList;
import java.util.List;

public class AfterJAVA8_Using_removeIf_Method {

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
        System.out.println("Original List:");
        System.out.println(list);
        
        // Requirement: Remove 'jaipur' if present
        System.out.println("\nChecking for 'jaipur' and removing if found...");
        list.removeIf(city -> city.equals("jaipur"));
        System.out.println("List after removing 'jaipur':");
        System.out.println(list);

        // Requirement: Remove 'kolkata' if present
        System.out.println("\nChecking for 'kolkata' and removing if found...");
        list.removeIf(city -> city.equals("kolkata"));
        System.out.println("List after removing 'kolkata':");
        System.out.println(list);

        // Final list after all removals
        System.out.println("\nFinal List:");
        System.out.println(list);
    }
}
