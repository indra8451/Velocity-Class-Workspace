package LambdaExpression.WithArgument.WithoutlambdaExpression;

import java.util.Scanner;

interface Addition {

	public int addtion(int no1, int no12);

}

public class Test {

	public static void main(String[] args) {

		System.out.println("enter the no1: ");
		Scanner scanner = new Scanner(System.in);
		int no1 = scanner.nextInt();

		System.out.println("enter the no2: ");

		int no2 = scanner.nextInt();

		// Addition add = (a, b) -> no1 + no2;  // this also work

		Addition add = (a, b) -> {

			return (no1 + no2);
		};

		int result = add.addtion(no1, no2);

		System.out.println("addition of " + no1 + " " + "and" + " " + no2 + " " + "is :" + " " + result);
	}

}
