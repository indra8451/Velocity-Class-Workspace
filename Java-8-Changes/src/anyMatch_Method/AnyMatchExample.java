package anyMatch_Method;
import java.util.ArrayList;
import java.util.List;

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

    public int getSalary() {
        return salary;
    }
}

public class AnyMatchExample {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();

        // Adding Employees
        empList.add(new Employee("Sudhir", 28, "Finance", 30000));
        empList.add(new Employee("Prakash", 35, "Human Resources", 45000));
        empList.add(new Employee("Archana", 30, "Technology", 50000));
        empList.add(new Employee("Rajesh", 32, "Marketing", 40000));
        empList.add(new Employee("Kavita", 27, "Sales", 35000));

        // Check if any employee has a salary of 50,000 or more
        boolean anyHaveHighSalary = empList.stream()
                                           .anyMatch(emp -> emp.getSalary() >= 50000);

        System.out.println("Any employee has a salary of 50,000 or more: " + anyHaveHighSalary);
    }
}


