package InterfaceChanges.InterfaceChange_Adding_StaticMethod;



public class Main {

	public static void main(String[] args) {
		
		Example example= new ExampleImpl1();
		example.x1();
		example.x2();
		Example.x4();  //static method calling by using interface name
	/*System.out.println();	
		Example example1= new ExampleImpl2();
		example1.x1();
		example1.x2();
		Example.x4();
	System.out.println();
		Example example2= new ExampleImpl3();
		example2.x1();
		example2.x2();
		Example.x4();*/
	}

}
