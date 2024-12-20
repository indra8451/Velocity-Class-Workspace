package predefinedFunctionalInterfaces.BiPredicate;

@FunctionalInterface
interface Sample {

	public boolean isSumGreaterThanTen(Integer a, Integer b);

}

public class Using_Bi_Predicate_Interface {

	public static void main(String[] args) {

		Sample sample = (a, b) -> {

			int c = a + b;

			if (c > 10) {

				return true;
			} else {

				return false;
			}
		};

		System.out.println(sample.isSumGreaterThanTen(5, 4)); //false
		System.out.println(sample.isSumGreaterThanTen(5, 8));//true
	}
}
