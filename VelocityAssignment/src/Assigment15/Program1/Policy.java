package Assigment15.Program1;


import java.util.Scanner;

public class Policy {
	int policyId;
	String policyName;
	String policyType;
	int premiumAmount;
	
	@Override
	public String toString() {
		return "Policy [policyId=" + policyId + ", policyName=" + policyName + ", policyType=" + policyType
				+ ", premiumAmount=" + premiumAmount + "]";
	}
	
	
	public Policy getPolicyDetails()
	{
		  Policy policy = new Policy();
		  
		   Scanner scanner = new Scanner(System.in);
		   
		   System.out.println("Enter the policy details:");
           
           System.out.print("Enter policy ID: ");
           policy.policyId = scanner.nextInt();
           scanner.nextLine();
           
           System.out.println("Enter policy Name: ");
           policy.policyName = scanner.nextLine();
        
           
           System.out.println("Enter policy Type: ");
           policy.policyType = scanner.nextLine();
         
           
           System.out.println("Enter premium Amount: ");
           policy.premiumAmount = scanner.nextInt();
      
	    return policy;
		
	}
	
	
	
}

