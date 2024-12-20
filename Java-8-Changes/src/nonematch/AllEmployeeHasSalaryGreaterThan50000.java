package nonematch;

import java.util.ArrayList;
import java.util.List;


public class AllEmployeeHasSalaryGreaterThan50000 {
	
	public static void main(String[] args) {
		
		List<Employee> empList=new ArrayList<Employee>();
		
		empList.add(new Employee("Archana", 30, "Technology", 50000));
		empList.add(new Employee("Anil", 45, "Operations", 55000));
		empList.add(new Employee("Amit", 31, "Quality Assurance", 51000));
		empList.add(new Employee("Priya", 26, "Research and Development", 78000));
		empList.add(new Employee("Vikas", 38, "Administration", 66000));

        // Check if none of the employees have a salary of 50,000 or more
        boolean noneHaveHighSalary = empList.stream()
                                            .noneMatch(emp -> emp.getSalary() >= 50000);

        System.out.println("None of the employees have a salary of 50,000 or more: " + noneHaveHighSalary);
    }
	
}
