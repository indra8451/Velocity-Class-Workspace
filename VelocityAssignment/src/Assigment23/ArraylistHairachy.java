package Assigment23;

import java.util.*;

public class ArraylistHairachy {
	
	public static void main(String[] args) {
		
		ArrayList<String> mahacityList= new ArrayList<String>();
		
		  Scanner scanner = new Scanner(System.in);

		    System.out.println("Enter the count of City for Maharastra: ");
		    int cnt = scanner.nextInt();
		    System.out.println("Enter the " + cnt + " City: ");
		    scanner.nextLine();
		    for (int i = 0; i < cnt; i++) {
		        String city = scanner.nextLine();
		        mahacityList.add(city);
		    }
		   // System.out.println("Maharastra:>>"+mahacityList);
		    
		    System.out.println("Enter the count of City of Karnataka: ");
			ArrayList<String> karnatakacityList= new ArrayList<String>();
		    int cnt1 = scanner.nextInt();
		    System.out.println("Enter the " + cnt1 + " City: ");
		    scanner.nextLine();
		    for (int i = 0; i < cnt1; i++) {
		        String city = scanner.nextLine();
		        karnatakacityList.add(city);
		    }
		   // System.out.println("karnataka:>>"+karnatakacityList);
		    
		    System.out.println("Enter the count of City of Madhya Pradesh: ");
			ArrayList<String> MadhyacityList= new ArrayList<String>();
		    int cnt2 = scanner.nextInt();
		    System.out.println("Enter the " + cnt2 + " City: ");
		    scanner.nextLine();
		    for (int i = 0; i < cnt2; i++) {
		        String city = scanner.nextLine();
		        MadhyacityList.add(city);
		    }
		   // System.out.println("Madhya Pradesh:>>"+MadhyacityList);
		    
		    
		   /////////////////////////////////////////////////////////////////////////////////////////
		    
		    HashMap<String, ArrayList<String>> statemap= new HashMap<String, ArrayList<String>>();
		    
		    statemap.put("Maharastra", mahacityList);
		    statemap.put("Karnataka", karnatakacityList);
		    statemap.put("Madhya Pradesh", MadhyacityList);
		    
		   Set<String> stateSet  =statemap.keySet();
		 /*  System.out.println(">>>>>>>>>>>>>>>>>>>State Map<<<<<<<<<<<<<<<<<<<");
		   for(String state:stateSet) {
			   
			   System.out.println(state+":"+statemap.get(state));
			   
		   }*/
		    
		   //////////////////////////////////////////////////////////////////////////////////////////
		   HashMap<String, HashMap<String, ArrayList<String>>> nationmap= new HashMap<String, HashMap<String, ArrayList<String>>>();
		   
		   nationmap.put("India",statemap); 
		    
		   System.out.println(">>>>>>>>>>>>>>>>>>>Country Info<<<<<<<<<<<<<<<<<<<");
		   
		  
		 //  System.out.println("India"+nationmap.get("India"));
		   
		   for (String country : nationmap.keySet()) {
	            System.out.println("Country: " + country);
	            Map<String, ArrayList<String>> states = nationmap.get(country);
	            for (String state : states.keySet()) {
	                System.out.println("  State: " + state);
	                List<String> cities = states.get(state);
	                for (String city : cities) {
	                    System.out.println("    - " + city);
	                }
	            }
	        }
		    
	}

}
