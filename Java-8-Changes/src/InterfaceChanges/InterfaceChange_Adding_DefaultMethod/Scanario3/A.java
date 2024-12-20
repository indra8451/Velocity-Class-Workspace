package InterfaceChanges.InterfaceChange_Adding_DefaultMethod.Scanario3;

public interface A {

	public default void getData() {

		System.out.println("Interface A :: getData() method");
	}
}
