package Assigment12.program3;

import java.util.Scanner;

public class TermPolicy  extends LifeInsurance{
	
	int duration;

	public int getDuration() {
		return duration;
	}

	public int setDuration(int duration) {
		return this.duration = duration;
	}
	
	
	public void getTermPolicyDetails() {
		
		TermPolicy termpolicy= new TermPolicy();
		 Scanner scanner= new Scanner(System.in);
		 System.out.println("Enter the Duration:-");
		 
		duration=scanner.nextInt();
		termpolicy.setDuration(duration);
		
		getTermPolicyInformation(termpolicy);
		
				  		  
	}
	
	public void getTermPolicyInformation(TermPolicy termpolicy ) {
		
		System.out.println("Duration is>>"+ termpolicy.getDuration());
	}

}
