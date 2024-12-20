package nonematch;

import java.util.ArrayList;
import java.util.List;

public class allAllEmployeeHasSalarySmallerThan25000 {
	

	public static void main(String[] args) {
		
		List<Employee> empList=new ArrayList<Employee>();
		
		empList.add(new Employee("Archana", 30, "Technology", 50000));
		empList.add(new Employee("Anil", 45, "Operations", 55000));
		empList.add(new Employee("Amit", 31, "Quality Assurance", 51000));
		empList.add(new Employee("Priya", 26, "Research and Development", 78000));
		empList.add(new Employee("Vikas", 38, "Administration", 66000));
		
		   // Check if all employees have a salary smaller than 25000
		 boolean flag =empList.stream().noneMatch(emp->emp.getSalary()<25000);
		 
		 System.out.println(flag);
	}

}
