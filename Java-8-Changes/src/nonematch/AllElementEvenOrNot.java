package nonematch;

import java.util.Arrays;
import java.util.List;

public class AllElementEvenOrNot {

	public static void main(String[] args) {

		List<Integer> numList = Arrays.asList(3,7,9,11,17);

		boolean flag = numList.stream().noneMatch(num -> num % 2 == 0);

		if (flag == true) {

			System.out.println("All numbers are even");
		} else {

			System.out.println("All numbers are not even");
		}

		
	}

}
