package Method_Referensce.Static_Method.Using_Mehtod_referensce;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input from the user
		System.out.println("Enter the 1st number: ");
		int a = scanner.nextInt();

		System.out.println("Enter the 2nd number: ");
		int b = scanner.nextInt();

		Addition addition = AdditionImpl::add;

		addition.add(a, b);

		scanner.close();
	}
}
