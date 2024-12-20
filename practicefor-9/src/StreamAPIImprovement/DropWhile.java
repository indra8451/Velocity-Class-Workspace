package StreamAPIImprovement;

import java.util.*;

public class DropWhile {
	
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList();
		l.add(10);
		l.add(30);
		l.add(25);
		l.add(40);
		l.add(50);
		System.out.println("using dropwhile method>>>");
		l.stream().dropWhile(p -> p % 2 == 0).forEach(p -> 
		System.out.println(p));
	}

}
