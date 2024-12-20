package AllMatch;

import java.util.Arrays;
import java.util.List;

public class AllElementEvenOrNot {

	public static void main(String[] args) {

		List<Integer> numList = Arrays.asList(2, 4, 6, 8, 10, 20, 30);

		List<Integer> numList1 = Arrays.asList(2, 3, 6, 8, 10, 20, 30);

		// True
		boolean flag = numList.stream().allMatch(num -> num % 2 == 0);

		if (flag == true) {

			System.out.println("All numbers are even");
		} else {

			System.out.println("All numbers are not even");
		}

		// False

		boolean result= numList1.stream().allMatch(num -> num % 2 == 0);

		if (result == true) {

			System.out.println("All numbers are even");
		} else {

			System.out.println("All numbers are not even");
		}
	}

}
