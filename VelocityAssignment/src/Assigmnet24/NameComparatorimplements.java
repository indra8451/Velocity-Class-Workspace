package Assigmnet24;
/*1. Suppose I have Employee class that containing I'd, name and 
 city now I want to sort the data based on comparable interface by using name.
*/

   import java.util.*;

   public class NameComparatorimplements {
	
	

	public static void main(String[] args) {
		
		ArrayList<Employee> emplist= new ArrayList<Employee>();
		
		System.out.println("Enter the count Of Employee: ");
		Scanner scanner = new Scanner(System.in);
		int cnt= scanner.nextInt();
		
		

			for(int i=1;i<=cnt;i++)
			{
				System.out.println("Enter the "+i+" "+"Employee Details: ");
				System.out.println("Enter ID: ");
				int id= scanner.nextInt();
				System.out.println("Enter Name: ");
				String name=scanner.next();
				System.out.println("Enter City: ");
				String city=scanner.next();
				emplist.add(new Employee(id, name, city));
				
			}
			
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>Before Sorting<<<<<<<<<<<<<<<<<<<<");
			for(Employee emp:emplist)
			{
				System.out.println("Employee ID:"+emp.getId());
				System.out.println("Employee Name:"+emp.getName());
				System.out.println("Employee City:"+emp.getCity());
			}
			
			Collections.sort(emplist,new EmployeeNameComparator());
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>After Sorting<<<<<<<<<<<<<<<<<<<<");
			for(Employee emp:emplist)
			{ 
				System.out.println("Employee ID:"+emp.getId());
				System.out.println("Employee Name:"+emp.getName());
				System.out.println("Employee City:"+emp.getCity());
			}
	}

}
