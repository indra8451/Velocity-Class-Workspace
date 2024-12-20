package predefinedFunctionalInterfaces.BiPredicate;

import java.util.function.BiPredicate;

public class UsingLambdaExpression {

	public static void main(String[] args) {
		
		BiPredicate<Integer, Integer> isSumGreaterThanTen = (a, b) -> (a + b) > 10;

		System.out.println(isSumGreaterThanTen.test(5, 7)); // true
		System.out.println(isSumGreaterThanTen.test(2, 3)); // false
	}
}
