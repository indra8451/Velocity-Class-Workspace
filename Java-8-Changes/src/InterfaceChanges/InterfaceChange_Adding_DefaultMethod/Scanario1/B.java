package InterfaceChanges.InterfaceChange_Adding_DefaultMethod.Scanario1;

public interface B {
	
	public default void print() {
		
		System.out.println("Interface B:: print() method");
	}

	public default void getData() {

		System.out.println("Interface B:: getData() method");
	}

}
