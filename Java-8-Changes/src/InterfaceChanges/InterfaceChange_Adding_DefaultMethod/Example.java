package InterfaceChanges.InterfaceChange_Adding_DefaultMethod;

public interface Example {

	abstract void x1();

	abstract void x2();
	// abstract void x3(); //if we add new method here it is necessary to override
	// it in implementation classes else it will give compile error.

	public default void x3() {

		System.out.println("This is x3 Default Method of ExampleInterface");

	}

	public default void x4() {

		System.out.println("This is x4 Default Method of ExampleInterface");

	}
}
