package Stream_API.MapAndCollect.GroupingBY;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GroupingByAndCountingExample {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<>();
		
		employeeList.add(new Employee("Alice", 25, "HR"));
		employeeList.add(new Employee("Bob", 30, "Finance"));
		employeeList.add(new Employee("Charlie", 28, "HR"));
		employeeList.add(new Employee("David", 35, "Finance"));
		employeeList.add(new Employee("Eve", 40, "IT"));
		employeeList.add(new Employee("Frank", 29, "IT"));

		// Group employees by department and count the number of employees in each department
		
		employeeList.stream().collect(Collectors.groupingBy(employee -> employee.getDepartment(),Collectors.counting())).forEach((dept,count)->{
			
			System.out.println("Department: " + dept + ", Count: " + count);
			
		});

	}

}
