package Assigment12.program2;

import java.util.Scanner;

public class ICICIBank extends Bank{
	
	
	
	public void getICICIBankDetails() {
		
		System.out.println("Enter the Principle Amount and Tenure as well Rate Of Interest of ICICI Bank:-");
		
		Scanner scanner = new Scanner(System.in);
		
		principleAmount=scanner.nextDouble();
		tenure=scanner.nextInt();
		rateOfInterest=scanner.nextFloat();
		
		getCalculateInterest( principleAmount,  tenure,  rateOfInterest);
		
	}

	public void getCalculateInterest(double principleAmount, int tenure, float rateOfInterest)
	{
		double Interest = principleAmount*tenure*rateOfInterest;
		
		System.out.println("Rate of Interest of ICICI Bank>>"+ Interest);
		
	}
	
}
