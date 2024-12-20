package CollectionEnhancement.Sorted_Method.SortingEmployeeObjectWithoutJava8;
public class Employee implements Comparable<Employee> {

	private int empId;
	private String empName;
	private double empSalary;

	public Employee(int empId, String empName, double empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

	@Override
	public int compareTo(Employee o) {

		if (this.empSalary == o.getEmpSalary()) {

			return 0;
		} else if (this.empSalary > o.getEmpSalary()) {
			return 1;
		} else {
			return -1;
		}
	}

}
