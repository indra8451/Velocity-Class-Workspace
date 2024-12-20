package inteviewpractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

class Test {

	public static void main(String[] args) {

	ArrayList<String> computer= new ArrayList<String>();
	computer.add("Watch");
	computer.add("Speaker");
	computer.add("laptop");
	
	ArrayList<String> electronics= new ArrayList<String>();
	electronics.add("Printer");
	electronics.add("Mouse");
	electronics.add("keyboards");
	
	ArrayList<String> furniture= new ArrayList<String>();
	furniture.add("Bed");
	furniture.add("Chair");
	furniture.add("Sofa");
	
	HashMap<String, ArrayList<String>> categories= new HashMap<String, ArrayList<String>>();
	categories.put("ComputerAndAccessories", computer);
	categories.put("Electronic", electronics);
	categories.put("Furniture", furniture);
	
	HashMap<String, HashMap<String, ArrayList<String>>> map= new HashMap<>();
	map.put("E Shop", categories);
	
	Set<String> s=map.keySet();
	
	for(String str:s) {
		
		System.out.println("Key: "+str);
		System.out.println("Value: "+map.get(str));
	}

	}

}