package com.interview.lambdaExpression.PredicateFunctionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

// write predicate functions which return employee name whoes salary >50000 and experience>3

class Employee {

	String name;
	int salary;
	int experience;

	Employee(String ename, int sal, int exp) {
		name = ename;
		salary = sal;
		experience = exp;
	}

}

public class PredicatFunctionalInterfaceForPrimitiveObjectType {

	public static void main(String[] args) {

		Predicate<Employee> p = e -> (e.salary > 50000 && e.experience > 3);

		// Ex1: TRUE Condition for Single object
		Employee emp = new Employee("Indrajit", 80000, 9);
		System.out.println(p.test(emp));

		// Ex2: FALSE Condition for Single object
		Employee emp1 = new Employee("Vishal", 20000, 1);
		System.out.println(p.test(emp1));

		// Ex2: Multiple object using ArrayList

		ArrayList<Employee> emplist = new ArrayList<>();
		emplist.add(new Employee("Divakar", 30000, 9));
		emplist.add(new Employee("Pravin", 60000, 5));
		emplist.add(new Employee("Priyanka", 80000, 2));
		emplist.add(new Employee("Kiran", 55000, 7));

		for (Employee e : emplist) {
			if (p.test(e)) {

				System.out.println("Employee Name and Salary>>>" + e.name + " " + e.salary);
			}

		}

	}

}
