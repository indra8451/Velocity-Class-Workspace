package Avergae;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AverageSalaryAndCountOfEmployees {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<Employee>();

		empList.add(new Employee("Sudhir", 28, "Finance", 30000));
		empList.add(new Employee("Prakash", 35, "Human Resources", 45000));
		empList.add(new Employee("Archana", 30, "Technology", 50000));
		empList.add(new Employee("Rajesh", 32, "Marketing", 40000));
		empList.add(new Employee("Kavita", 27, "Sales", 35000));
		empList.add(new Employee("Anil", 45, "Operations", 55000));
		empList.add(new Employee("Meena", 29, "Customer Support", 32000));
		empList.add(new Employee("Amit", 31, "Quality Assurance", 38000));
		empList.add(new Employee("Priya", 26, "Research and Development", 48000));
		empList.add(new Employee("Vikas", 38, "Administration", 46000));

		// Calculate average salary
		double avg = empList.stream().collect(Collectors.summarizingInt(emp -> emp.getSalary())).getAverage();

		System.out.println("Avg salary: " + avg);

		// Calculate count ways

		System.out.println("1st way ");
		Long empCount = empList.stream().collect(Collectors.summarizingInt(emp -> emp.getSalary())).getCount();

		System.out.println("Count: " + empCount);

		System.out.println("2nd way ");
		Long empCount1 = empList.stream().count();

		System.out.println("Count: " + empCount1);
		
		System.out.println("3rd way ");
		Long empCount2 = empList.stream().collect(Collectors.counting());

		System.out.println("Count: " + empCount2);

	}

}
