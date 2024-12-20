package predefinedFunctionalInterfaces.Supplier;

import java.util.Date;

@FunctionalInterface
interface GettingCurrentDateTime {

	public abstract Date genrateDate();

}

@FunctionalInterface
interface Test {
	public String getString();
}

public class UsingLambdaExpression {

	public static void main(String[] args) {

		//Ex1 getting Current DateTime
		
		GettingCurrentDateTime gettingCurrentDateTime = () -> {

			return new Date();
		};

		System.out.println(gettingCurrentDateTime.genrateDate());
		
		//Ex2 getting String 
		
		Test test=()-> "Java is Fabulous programing language";
		
		System.out.println(test.getString());
		
	}

}
