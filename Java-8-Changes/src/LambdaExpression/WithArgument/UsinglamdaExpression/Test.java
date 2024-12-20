package LambdaExpression.WithArgument.UsinglamdaExpression;

import java.util.Scanner;

interface Addition {

	public int addtion(int no1, int no12);

}

class additionImpl implements Addition {

	@Override
	public int addtion(int no1, int no2) {

		return (no1 + no2);
	}

}

public class Test {

	public static void main(String[] args) {

		Addition add = new additionImpl();

		System.out.println("enter the no1: ");
		Scanner scaaner = new Scanner(System.in);
		int no1 = scaaner.nextInt();

		System.out.println("enter the no2: ");

		int no2 = scaaner.nextInt();

		int result = add.addtion(no1, no2);

		System.out.println("addition of " + no1 + " " + "and" + " " + no2 + " " + "is :" + " " + result);
	}

}
