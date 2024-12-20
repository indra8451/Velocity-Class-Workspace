package CollectionEnhancement.Min_Method;
import java.util.ArrayList;
import java.util.List;

public class MinimumFromEmploeeListUsingLambdaExpression {
	
	public static void main(String[] args) {
		
		List<Employee> emplist= new ArrayList<Employee>();
		
		emplist.add( new Employee(1234, "Rajesh Sharma", 50000.0));
		emplist.add( new Employee(5678, "Kiran Verma", 65000.50));
		emplist.add( new Employee(9101, "Vikram Singh", 75000.75));
		emplist.add( new Employee(1121, "Anjali Mehta", 48000.0));
		emplist.add( new Employee(3141, "Suresh Patil", 55000.25));
		emplist.add( new Employee(5161, "Krishna Nair", 72000.0));
		emplist.add( new Employee(7181, "Amit Reddy", 67000.80));
		emplist.add( new Employee(9202, "Deepa Iyer", 59000.45));
		emplist.add( new Employee(1222, "Rohan Kulkarni", 83000.0));
		emplist.add( new Employee(3242, "Kavita Joshi", 78000.60));
		
		
		System.out.println("Name of employee Whoes salary is minimum>>\n");
		
		emplist.stream().min((emp1,emp2)->{
			
			if(emp1.getEmpSalary()<emp2.getEmpSalary()) {
				
				return -1;
			}else if(emp1.getEmpSalary()>emp2.getEmpSalary()){
				
				return 1;
			}else {
				
				return 0;
			}
			
		}).ifPresent(emp->System.out.println(emp.getEmpName()));
		
	}

}
