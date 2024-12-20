package RgPractise;




class SuperClass {
    protected void display() {
        System.out.println("SuperClass display method");
    }
}

class SubClass extends SuperClass {
    @Override
	protected void display() { // 'protected' can be overridden with 'public'
        System.out.println("SubClass display method");
    }
}


public class Main {

	public static void main(String[] args) {
		
		SubClass subclass = new SubClass();
		subclass.display();
		
	}

}
