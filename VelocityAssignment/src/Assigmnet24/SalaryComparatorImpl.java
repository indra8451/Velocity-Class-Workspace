package Assigmnet24;

/*2. Suppose I have Student class containing I'd, name and salary
 *  now I want to sort the data based on comparator interface by using salary.
*/   import java.util.*;

   public class SalaryComparatorImpl {
	   
	public static void main(String[] args) {
		
		ArrayList<Student> emplist= new ArrayList<Student>();
		
		System.out.println("Enter the count Of Student: ");
		Scanner scanner = new Scanner(System.in);
		int cnt= scanner.nextInt();
		
			for(int i=1;i<=cnt;i++)
			{
				System.out.println("Enter the "+i+" "+"Student Details: ");
				System.out.println("Enter ID: ");
				int id= scanner.nextInt();
				System.out.println("Enter Name: ");
				String name=scanner.next();
				System.out.println("Enter Salary: ");
				int salary=scanner.nextInt();
				emplist.add(new Student(id, name, salary));
				
			}
			
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>Before Sorting<<<<<<<<<<<<<<<<<<<<");
			for(Student emp:emplist)
			{
				System.out.println("Student ID:"+emp.getId());
				System.out.println("Student Name:"+emp.getName());
				System.out.println("Student salary:"+emp.getsalary());
			}
			
			Collections.sort(emplist,new StudentSalaryComaparator());
			
			System.out.println(">>>>>>>>>>>>>>>>>>After Sorting<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
			for(Student emp:emplist)
			{ 
				System.out.println("Student ID:"+emp.getId());
				System.out.println("Student Name:"+emp.getName());
				System.out.println("Student salary:"+emp.getsalary());
			}
	}

}
