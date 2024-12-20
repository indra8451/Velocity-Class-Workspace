package Stream_API.MapAndCollect;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Employee {
	private String name;
	private int age;
	private int salary;

	// Constructor
	public Employee(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	// Getters
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

}

public class NameCollectingInList {

	public static void main(String[] args) {

		List<Employee> employeelist = new ArrayList<Employee>();

		employeelist.add(new Employee("Indrajit", 25, 250000));
		employeelist.add(new Employee("Bob", 30, 30000));
		employeelist.add(new Employee("Charlie", 28, 32000));
		employeelist.add(new Employee("Charlie", 22, 39000));// duplicate not shown in set

		System.out.println("Before transforming: ");
		System.out.println(employeelist);

		Set<String> nameSet = employeelist.stream().map(emp->emp.getName()).collect(Collectors.toSet());

		System.out.println("\nAfter transforming: ");

		System.out.println(nameSet);

	}

}
