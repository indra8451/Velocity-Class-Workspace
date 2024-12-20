package com.interview.OnNumber.practice.program;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeInfo {

	public void EmpPrint(ArrayList<Employee> EmployeeList) 
	{
		System.out.println("Employee details");
		for(Employee emp: EmployeeList)
		{
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			
			System.out.println(emp.EMPID);
			System.out.println(emp.NAME);
			System.out.println(emp.DEPT);
			System.out.println(emp.AGE);
			
			
			
		}
		
	}
	
	public static void main(String[] args) {
	
		EmployeeInfo empifo= new EmployeeInfo();
		
		ArrayList<Employee> emplist= new ArrayList<>();
		emplist.add(new Employee("E01", "Indra", "H.R", 26));
		emplist.add(new Employee("E02", "Vina", "MANAGER", 29));
		emplist.add(new Employee("E03", "Sunil", "Store MANAGER", 45));
		emplist.add(new Employee("E04", "Indra", "Shift MANAGER", 40));
		emplist.add(new Employee("E05", "Vina", " Genral MANAGER", 47));
		
		empifo.EmpPrint(emplist);  // To print
		
		//Count EMPLOYEE Name
		
		Map<String, Long> namecount  =emplist.stream().collect(Collectors.groupingBy(Employee::getNAME ,Collectors.counting()));
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println(namecount);
	}
	
	

}
