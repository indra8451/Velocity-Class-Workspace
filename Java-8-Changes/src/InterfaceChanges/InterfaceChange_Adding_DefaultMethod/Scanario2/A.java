package InterfaceChanges.InterfaceChange_Adding_DefaultMethod.Scanario2;

public interface A {

	public default void print() {

		System.out.println("Interface A :: print() method");
	}
}
