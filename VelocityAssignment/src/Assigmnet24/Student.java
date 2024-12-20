package Assigmnet24;

public class Student {
	
	private int id;
	private String Name;
	private  int salary;
	
	public Student(int id, String name, int salary) {
		this.id = id;
		Name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getsalary() {
		return salary;
	}

	public void setsalary(int salary) {
		this.salary = salary;
	}

	

	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", salary=" + salary + "]";
	}
	
	
}
 

