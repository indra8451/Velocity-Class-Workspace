package InterfaceChanges.InterfaceChange_Adding_DefaultMethod;

public class ExampleImpl1  implements Example{

	@Override
	public void x4() {
		
		System.out.println("This is overrided default x4() method in ExampleImpl1");
	}

	@Override
	public void x3() {
		
		System.out.println("This is overrided default x3() method in ExampleImpl1");
	}

	@Override
	public void x1() {

		System.out.println("This is ExampleImpl1 x1() method");
		
	}

	@Override
	public void x2() {
		
		System.out.println("This is ExampleImpl1 x2() method");
	}

}
