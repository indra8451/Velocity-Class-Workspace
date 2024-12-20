package com.interview.OnNumber.practice.program;

public class Employee {

	String EMPID;
	String  NAME;
	String DEPT;
	int AGE;
	
	
	public Employee(String eMPID, String nAME, String dEPT, int aGE) {
		super();
		EMPID = eMPID;
		NAME = nAME;
		DEPT = dEPT;
		AGE = aGE;
	}
	public String getEMPID() {
		return EMPID;
	}
	public void setEMPID(String eMPID) {
		EMPID = eMPID;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getDEPT() {
		return DEPT;
	}
	public void setDEPT(String dEPT) {
		DEPT = dEPT;
	}
	public int getAGE() {
		return AGE;
	}
	public void setAGE(int aGE) {
		AGE = aGE;
	}
	
	
}
