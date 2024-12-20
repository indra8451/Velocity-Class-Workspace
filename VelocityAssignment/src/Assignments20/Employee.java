package Assignments20;

public class Employee {
	
	private String Name;
	private int Id;

	public Employee(String name,int id) {
		this.Name = name;
		this.Id=id;
	}

	@Override
	public String toString() {
		return " Name: " + Name + " "+"And ID: "+Id;
	}

	
}
