package com.interview.lambdaExpression.FunctionFunctionalInterface;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employeer {
	String name;
	int salary;

	public Employeer(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
}

public class Function_FunctionalInterfaceforObjectDatatype {

	public static void main(String[] args) {

		ArrayList<Employeer> emplist = new ArrayList<>();

		// Define a Function that takes an Employee and returns their name if their
		// salary is between 25000 and 60000, else null
		Function<Employeer, String> f = e -> {
			if ((e.salary >= 25000) && (e.salary <= 60000)) {
				return e.name;
			} else {
				return null;
			}
		};

		// Define a Predicate that checks if a string starts with "v"
		Predicate<String> p = s -> s.startsWith("v");

		// Add Employee objects to the list
		emplist.add(new Employeer("indrajit", 52000));
		emplist.add(new Employeer("vishal", 32000));
		emplist.add(new Employeer("patil", 24000));
		emplist.add(new Employeer("vinayak", 50000));
		emplist.add(new Employeer("sunil", 2000));
		emplist.add(new Employeer("kiran", 10000));

		System.out.println("Names of employees start with 'v' and  salary is between 25000 and 60000");

		for (Employeer emp : emplist) {
			// Apply the function to check if the salary is in the specified range
			if (f.apply(emp) != null) {
				// Apply the predicate to check if the name starts with "v"
				if (p.test(emp.name)) {
					// Store the name in a variable
					String name = emp.name;
					// Print the name
					System.out.println(name);
				}
			}
		}
	}
}
