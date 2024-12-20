package DiamondOperator.AnnonymousInnerClassusingExtendsKeyword;

public class Main {

	public static void main(String[] args) {

		TestImpl testimpl = new TestImpl();

		testimpl.validate(10);
		testimpl.validate("Indrajith");
		testimpl.validate(testimpl);
	}

}
