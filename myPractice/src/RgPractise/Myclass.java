package RgPractise;


//Abstract class named Addition
abstract class Addition {
	// Abstract method named add, which must be implemented by any subclass
	 public abstract void add(int a, int b);
	 
	 // Concrete method named print, which has an implementation
	 public void print() {
	     System.out.println("Hello Addition Print method");
	 }
 
}

//Concrete class named Myclass that extends the abstract class Addition
public class Myclass extends Addition {

 // Implementation of the abstract method add
 @Override
 public void add(int a, int b) {
     // Print the sum of a and b
     System.out.println(a + b);
 }
 
 // Main method to run the application
 public static void main(String[] args) {
     // Create an instance of Myclass
     Myclass myclass = new Myclass();
     
     // Call the add method with parameters 10 and 20
     myclass.add(10, 20); // Output: 30
     
     // Call the print method
     myclass.print(); // Output: Hello Addition Print method
 }
}

 
 





