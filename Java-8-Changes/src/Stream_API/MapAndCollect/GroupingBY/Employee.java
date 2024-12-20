package Stream_API.MapAndCollect.GroupingBY;

class Employee {
	private String name;
	private int age;
	private String department;

	// Constructor
	public Employee(String name, int age, String department) {
		this.name = name;
		this.age = age;
		this.department = department;
	}

	// Getters
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getDepartment() {
		return department;
	}
}
