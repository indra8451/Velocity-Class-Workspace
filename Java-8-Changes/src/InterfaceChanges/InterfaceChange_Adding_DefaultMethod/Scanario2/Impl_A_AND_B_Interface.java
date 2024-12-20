package InterfaceChanges.InterfaceChange_Adding_DefaultMethod.Scanario2;

public class Impl_A_AND_B_Interface implements A, B { // here only one inteface method we can implement bcoz of same
														// name


	@Override
	public void print() {
		A.super.print();
	}
	
	/*@Override     //if we write then getting same duplicate method name error either implement one interface like that
	public void print() {
		B.super.print();
	}*/
	
	/*@Override     //scenario 4 implementation
	public void print() {
		B.super.print();
		A.super.print();
	}*/

}
