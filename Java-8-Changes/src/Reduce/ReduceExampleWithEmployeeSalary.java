package Reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Employee {
	private String name;
	private double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

public class ReduceExampleWithEmployeeSalary {
	public static void main(String[] args) {
		// List of employees
		List<Employee> employees = Arrays.asList(
				new Employee("John", 50000),
				new Employee("Jane", 60000),
				new Employee("Jack", 55000));

		// Using reduce to calculate the total salary
		Optional<Double> totalSalary = employees.stream().map(emp -> emp.getSalary()) // Extract salaries
				// .reduce(0.0, Double::sum); // Sum up the salaries method reference with initial valiue
				.reduce((a, b) -> a + b);

		System.out.println("Total salary of all employees: " + totalSalary.orElse(0.0));
	}
}
