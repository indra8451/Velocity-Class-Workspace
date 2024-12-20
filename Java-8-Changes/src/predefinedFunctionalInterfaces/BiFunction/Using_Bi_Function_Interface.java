package predefinedFunctionalInterfaces.BiFunction;

import java.util.function.BiFunction;

public class Using_Bi_Function_Interface {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

		BiFunction<String, String, String> combine = (s1,s2)->s1+" "+s2;

		
		System.out.println(add.apply(5, 3)); // Output: 8
		System.out.println(add.apply(10, 15)); // Output: 25
		
		System.out.println(combine.apply("Jay", "Bajaranbali"));  //Jay Bajaranbali
	}

}
