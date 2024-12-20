package CollectionEnhancement.Sorted_Method.SortingEmployeeObjectUsingStreamApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		List<Employee> emplist= new ArrayList<Employee>();
		
		emplist.add( new Employee(1234, "Rajesh Sharma", 50000.0));
		emplist.add( new Employee(5678, "Kiran Verma", 65000.50));
		emplist.add( new Employee(9101, "Vikram Singh", 75000.75));
		emplist.add( new Employee(1121, "Anjali Mehta", 48000.0));
		emplist.add( new Employee(3141, "Suresh Patil", 55000.25));
		emplist.add( new Employee(5161, "Krishna Nair", 72000.0));
		emplist.add( new Employee(7181, "Amit Reddy", 67000.80));
		emplist.add( new Employee(9202, "Deepa Iyer", 59000.45));
		emplist.add( new Employee(1222, "Rohan Kulkarni", 83000.0));
		emplist.add( new Employee(3242, "Kavita Joshi", 78000.60));
		
		
		System.out.println("After sorting-Ascending Order>>\n");
		
		
		emplist.stream().sorted(new NameComparator()).
		     forEach(emp->System.out.println(emp)); //by default order is ascending
		
		System.out.println("\nAfter sorting-Descending Order>>\n");
		emplist.stream().sorted(Collections.reverseOrder(new NameComparator())).
		forEach(emp->System.out.println(emp));// In descending order

	}

}


/*
 * If a POJO or model class does not implement Comparable, using
 * Collections.reverseOrder() will result in a ClassCastException when executed.
 * Therefore, you must pass a custom comparator, such as new NameComparator(),
 * to Collections.reverseOrder(). This means you should use
 * sorted(Collections.reverseOrder(new NameComparator())) to achieve the desired
 * sorting order.
 */