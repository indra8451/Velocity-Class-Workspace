package findFirsrt;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Employee {
    private String name;
    private int age;
    private String department;
    private int salary;

    public Employee(String name, int age, String department, int salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", department='" + department + "', salary=" + salary + "}";
    }
}

public class FindFirstExample {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();

        // Adding Employees
        empList.add(new Employee("Sudhir", 28, "Finance", 30000));
        empList.add(new Employee("Prakash", 35, "Human Resources", 45000));
        empList.add(new Employee("Archana", 30, "Technology", 50000));
        empList.add(new Employee("Rajesh", 32, "Marketing", 40000));
        empList.add(new Employee("Kavita", 27, "Sales", 35000));

        // Use findFirst to get the first employee in the list
        Optional<Employee> firstEmployee = empList.stream().findFirst();

        // Print the result
        firstEmployee.ifPresent(emp->System.out.println(emp.getName()));
    }
}
