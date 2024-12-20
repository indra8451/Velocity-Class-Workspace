package Assigment_8;

import java.util.Scanner;

/*
 * 1.2 Design the class as EmployeeInformation which takes 
 * the input for single students from user and 
 * Design method public void getUserInput(), 
	country is same for all the students.
 */
public class EmployeeInformation {
	
	int no;
	public void getUserInput()
	{
		
		System.out.println("Enter the employee details");
		Employee emp=new Employee();
		Scanner sobj= new Scanner(System.in);
		
		System.out.println("Enter the firstName:- ");
		emp.firstName=sobj.next();
		
		System.out.println("Enter the lastName:- ");
		emp.lastName=sobj.next();
		System.out.println("Enter the city:- ");
		emp.city=sobj.next();
		System.out.println("Enter the mobileNumber:- ");
		emp.mobileNumber=sobj.next();
		System.out.println("Enter the country:- ");
		Employee.country=sobj.next();
		getEmployeeInformation(emp.firstName,emp.lastName,emp.city,emp.mobileNumber,Employee.country);	
		
	}

	public  void getEmployeeInformation(String firstname,String lastname,String city, String mobileNumber,String country)
	{
		System.out.println("Employee details are as below:-");
		System.out.println("Employee Firstname>> "+ firstname);
		System.out.println("Employee lastname>> "+ lastname);
		System.out.println("Employee City>> "+ city);
		System.out.println("Employee mobileNumber>> "+ mobileNumber);
		System.out.println("Employee country>> "+ country);
		
	}
	
	public static void main(String[] args) {
		EmployeeInformation empinfo= new EmployeeInformation(); 
		System.out.println("Enter the count of Employee to enter details:-");
		
		Scanner sobj= new Scanner(System.in);
		int num=sobj.nextInt();
		for(int i=0;i<num;i++)
		{
			
			empinfo.getUserInput();
		}
	}
}
