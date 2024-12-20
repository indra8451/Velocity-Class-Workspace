package Method_Referensce.Instance_Method.Using_Mehtod_referensce;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.println("Enter the 1st number: ");
        int a = scanner.nextInt();

        System.out.println("Enter the 2nd number: ");
        int b = scanner.nextInt();

        // Creating an instance of AdditionImpl
        AdditionImpl additionImpl = new AdditionImpl();

        // Using a method reference to call the add method
        Addition addition = additionImpl::add;

        // Calling the add method using the method reference
        addition.add(a, b);

        // Close the Scanner to free resources
        scanner.close();
    }
}
