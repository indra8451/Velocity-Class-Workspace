package RgPractise;

/*Suppose I have two classes C & D which will implements interface 
test*/


interface test{
	
	void Print();
}

class C implements test{

	@Override
	public void Print() {
		System.out.println("In class C");
		
	}
	
	
}

class D implements test{

	@Override
	public void Print() {
		System.out.println("In class D");
	}
	
	
}


public class LooseCouple {

	public static void main(String[] args) {
		
		C a= new C();
		a.Print();
		
		D b= new D();
		b.Print();
		
		test rg= new D();
		rg.Print();

	}

}
