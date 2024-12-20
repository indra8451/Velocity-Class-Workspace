package DiamondOperator.UsingAnonymousClass;

public class TestImpl {

	public static void main(String[] args) {

		Test<Object> test = new Test<Object>() { // No need for generic here

			@Override
			public void validate(Object t) {
				System.out.println("We got an object of type: " + t.getClass().getName());
			}
		};

		test.validate(10);
		test.validate("Indrajith");
		test.validate(new TestImpl());
	}
}
