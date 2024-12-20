package Assigment12.program3;

import java.util.Scanner;

public class LifeInsurance  extends Insurance{

	int premiumAmount;

	
	public int getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(int premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public void getLifeInsuranceDetails() {
		
	  System.out.println("Enter the Premium Amount:-");
	   Scanner scanner= new Scanner(System.in);
		LifeInsurance lifeinsurance= new LifeInsurance();
		
		premiumAmount=scanner.nextInt();
		lifeinsurance.setPremiumAmount(premiumAmount);
		
		getLifeInsuranceInformation(lifeinsurance);
		
		
	}
	
	public void getLifeInsuranceInformation(LifeInsurance lifeinsurance) {
		
		System.out.println("Premium Ammount is>>"+ lifeinsurance.getPremiumAmount());
		
	}
	
}
