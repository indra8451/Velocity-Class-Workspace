package Assignments20;

import java.util.*;

public class EmployeeList{

	public static ArrayList<Employee> employeeList() {
		System.out.println("How many Employee Details you want to add in list:");
		Scanner scanner = new Scanner(System.in);
		int no= scanner.nextInt();
		
		ArrayList<Employee> emplist= new ArrayList<Employee>();
		
		for(int i=0;i<no;i++)
		{
			System.out.println("Enter Employee Name:");
			String city= scanner.next();
			System.out.println("Enter Employee ID:");
			int id= scanner.nextInt();
			emplist.add(new Employee(city,id));
		}
		
		
		return emplist;
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Employee> emplist=employeeList();
		
		System.out.println(" Employee List Data>>>>>>>>>");
		for(Employee emp:emplist)
		{
			System.out.println(emp);
		}
		
		

	}

}
