package PrivateMethod;

public class TestImpl implements Test{

	@Override
	public void demo(String name) {
		
		Test.super.demo(name);
	}

	
	
}
