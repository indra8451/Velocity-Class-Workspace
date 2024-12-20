package PrivateMethod;

public interface Test {

	private void getName(String name) {

		System.out.println("My name is: " + name);
	}
	
	public default void demo(String name) {
		
		getName(name);
	}
}
