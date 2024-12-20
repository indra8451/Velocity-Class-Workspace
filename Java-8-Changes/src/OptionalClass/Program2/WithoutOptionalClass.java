package OptionalClass.Program2;

import java.util.List;

public class WithoutOptionalClass {

	public static List<String> x1() {
		return null;
	}

	public static void main(String[] args) {
		List<String> list = x1();
		String firstElement = list.get(0);//Potential NullPointerException/
		System.out.println(firstElement);
	}
}






