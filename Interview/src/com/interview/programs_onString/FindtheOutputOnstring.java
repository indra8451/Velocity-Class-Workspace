package com.interview.programs_onString;

public class FindtheOutputOnstring {

	public static void main(String[] args) {
		
		String s1= new String("hello");
		String s2="hello";
		s1=s1.intern();  //intern method return the address from string constant pool
		String s3= new String("hello");
		String s4="hello";
		String s5= new String("Hello").intern();/*intern method return the address from string constant pool
		                                         otherwise return new address from heap*/ 
		String s6="Hello";
		String s7= new String("Hello").intern();/*intern method return the address from string constant pool 
		                                         otherwise return new address from heap 	*/	
		
	    System.out.println("Comparisons using == operator:");
        System.out.println("s1 == s2: " + (s1 == s2)); // true
        System.out.println("s1 == s3: " + (s1 == s3)); // false
        System.out.println("s1 == s4: " + (s1 == s4)); // false
        System.out.println("s2 == s3: " + (s2 == s3)); // false
        System.out.println("s2 == s4: " + (s2 == s4)); // true
        System.out.println("s3 == s4: " + (s3 == s4)); // false
        System.out.println("s4 == s5: " + (s4 == s5)); // false
        System.out.println("s5 == s6: " + (s5 == s6)); // true
        System.out.println("s6 == s7: " + (s6 == s7)); // true
		
		/*   
		
		
		 New Keyword (new String(...)):

		When you create a string using the new keyword, a new String object is created in the heap memory.
	    Even if the string content is the same as another string,
	     each new call creates a distinct object with  different address..
				
		String Literals:
				
		Stored in the string pool.
		If the string already exists in the pool, Java returns the address of the existing string.
        If the string does not exist in the pool, 
        Java adds it to the pool and returns the address of this new entry.

		 */

	}

}
