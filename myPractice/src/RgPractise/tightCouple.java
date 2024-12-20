package RgPractise;

class A{
	
	public void Demo() {
		System.out.println("In class A");
	}
}

class B {
	
	public B() {
		A a= new A();
		a.Demo();
	}
	
	public void Demo2() {
		
		System.out.println("In class B");
	}
	
}


public class tightCouple {

	public static void main(String[] args) {
		
		B b= new B();
		b.Demo2();

	}

}
