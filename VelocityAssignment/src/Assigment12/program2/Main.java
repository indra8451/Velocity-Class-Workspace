package Assigment12.program2;

public class Main {

	public static void main(String[] args) {


		ICICIBank icici= new ICICIBank();
		icici.getICICIBankDetails();
		
		SBIBank sbi= new SBIBank();
		sbi.getSBIBankDetails();
		
		HDFCBank hdfc= new HDFCBank();
		hdfc.getHDFCBankDetails();
		
	}

}
