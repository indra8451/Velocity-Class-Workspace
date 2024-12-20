package InterfaceChanges.InterfaceChange_Adding_DefaultMethod.Scanario3;

public class Impl_A_AND_B_Interface implements A, B {

	@Override
	public void print() {
		System.out.println("This is overrided default print() method in Impl_A_AND_B_Interface class");
	}

	@Override
	public void getData() {
		System.out.println("This is overrided default getData() method in Impl_A_AND_B_Interface class");

	}

}
