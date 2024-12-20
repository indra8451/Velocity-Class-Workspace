package Distinct;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

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

    public double getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object obj) {
        // Check if the same object reference
        if (this == obj) return true;
        
        // Check if the object is null or of a different class
        if (obj == null || getClass() != obj.getClass()) return false;

        // Type cast the object to Employee
        Employee employee = (Employee) obj;

        // Compare relevant fields
        return Double.compare(employee.salary, salary) == 0 && 
               Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
}

public class DistinctEmployeeExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("John", 50000),
            new Employee("Jane", 60000),
            new Employee("John", 50000), // Duplicate
            new Employee("Jake", 55000),
            new Employee("Jane", 60000)  // Duplicate
        );

        // Use distinct to remove duplicate employees
        List<Employee> uniqueEmployees = employees.stream()
            .distinct()
            .collect(Collectors.toList());

        // Print unique employees
        uniqueEmployees.forEach(System.out::println);
    }
}
