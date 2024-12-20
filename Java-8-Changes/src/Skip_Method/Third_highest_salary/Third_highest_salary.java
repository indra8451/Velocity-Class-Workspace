package Skip_Method.Third_highest_salary;

import java.util.ArrayList;
import java.util.List;

public class Third_highest_salary {
	
	public static void main(String[] args) {
		
		List<Employee> empList= new ArrayList<Employee>();
		
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


		
		empList.stream().sorted((emp1,emp2)->{

			if(emp1.getSalary() > emp2.getSalary()){
				
				return -1;
			}else if(emp1.getSalary() < emp2.getSalary()){
				
				return 1;
				
			}else {
				
				return 0;
			}
			
		}).skip(2).limit(1).forEach(emp->System.out.println(emp));
		

	}

}
