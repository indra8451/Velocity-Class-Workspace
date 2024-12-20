package inteviewpractice;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<Employee>();

		employees.add(new Employee(11, "Indrajit", 2500));
		employees.add(new Employee(2, "Priya", 3000));
		employees.add(new Employee(30, "Rahul", 4000));
		employees.add(new Employee(24, "Amit", 3500));
		employees.add(new Employee(5, "Sneha", 2800));

		//Collections.sort(employees);
		System.out.println("\nEmployees after sorting By Id Using Comparable:");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		Collections.sort(employees, new SalaryComparator());
		
		System.out.println("\nEmployees after sorting By Salary Using Comparator:");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		Collections.sort(employees, new nameComparator());

		System.out.println("\nEmployees after sorting By Name Using Comparator:");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

}