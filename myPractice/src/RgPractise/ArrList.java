package RgPractise;

import java.util.*;

public class ArrList {

	public static void main(String[] args) {
		
		   List<String> arrlist = new LinkedList<>();
		
		arrlist.add("indra");
		arrlist.add("mahesh");
		arrlist.add("rahul");
		
		ListIterator<String> itr=arrlist.listIterator();
	System.out.println(itr.getClass());
	String s1="javatpoint";  
	System.out.println(s1.substring(2,4));//returns va  
	System.out.println(s1.indexOf('v'));//2
	System.out.println(s1.indexOf('a',2));//3
	System.out.println(s1.substring(3,6));//3
	System.out.println(s1.substring(2));//returns vatpoint  
	
	

		
}
}
