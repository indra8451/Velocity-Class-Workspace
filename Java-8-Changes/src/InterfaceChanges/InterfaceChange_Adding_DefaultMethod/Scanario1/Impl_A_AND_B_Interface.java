package InterfaceChanges.InterfaceChange_Adding_DefaultMethod.Scanario1;

public class Impl_A_AND_B_Interface implements A, B { //here only one inteface method we can implement bcoz of same name

	@Override
	public void getData() {
		
		B.super.getData();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		A.super.print();
	}

	
}
