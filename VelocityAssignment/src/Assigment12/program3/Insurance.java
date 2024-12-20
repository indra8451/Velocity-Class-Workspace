package Assigment12.program3;

import java.util.Scanner;

public class Insurance {
	
	int id;
	String personName;
	String insuranceCompany;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getInsuranceCompany() {
		return insuranceCompany;
	}
	public void setInsuranceCompany(String insuranceCompany) {
		this.insuranceCompany = insuranceCompany;
	}
	
	
	
	public void getInsuranceDetails() {
		
		System.out.println("Enter the Details ID,PersonName and Issurance Company");
		Scanner scanner= new Scanner(System.in);
		Insurance insurance= new Insurance();
		
		id=scanner.nextInt();
		insurance.setId(id);
		
		personName=scanner.next();
		insurance.setPersonName(personName);
		
		insuranceCompany=scanner.next();
		insurance.setInsuranceCompany(insuranceCompany);
		
		getInsuranceInformation(insurance);
	}
	
	public void getInsuranceInformation(Insurance insurance )
	{
		
		System.out.println("Id is>>"+ insurance.getId());
		System.out.println("Person Name is>>"+ insurance.getPersonName());
		System.out.println("Insurrance Company is>>"+ insurance.getInsuranceCompany());
	}
}
