package Assigmnet24;

import java.util.Comparator;

public class StudentSalaryComaparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return Integer.compare(o1.getId(), o2.getId());
		
		
	}
	
	

}
