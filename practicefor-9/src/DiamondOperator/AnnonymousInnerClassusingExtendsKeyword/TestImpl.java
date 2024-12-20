package DiamondOperator.AnnonymousInnerClassusingExtendsKeyword;

public class TestImpl extends Test {

	@Override
	public void validate(Object t) {
		
		System.out.println("We Got object which was Type of: " + t.getClass().getName());
	}

}
