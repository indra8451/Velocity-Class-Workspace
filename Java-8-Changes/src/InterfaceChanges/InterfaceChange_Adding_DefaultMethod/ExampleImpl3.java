package InterfaceChanges.InterfaceChange_Adding_DefaultMethod;

public class ExampleImpl3 implements Example{

	public void callingDefault() {
		
		Example.super.x3();
	}
	
	@Override
	public void x1() {
		System.out.println("This is ExampleImpl3 x1() method");
		
	}

	@Override
	public void x2() {
		System.out.println("This is ExampleImpl3 x2() method");
		
	}
	
	public static void main(String[] args) {
		
		ExampleImpl3 example= new ExampleImpl3();
		
		example.callingDefault();// calling default method of interface
	}

}
