package Method_Referensce.Constructor_Reference.Using_lambda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        
        System.out.println("Enter the 1st number: ");
        int a = scanner.nextInt();

        System.out.println("Enter the 2nd number: ");
        int b = scanner.nextInt();


        // Using a method reference to call the add method
        Addition additionMethodReference = AdditionImpl::new;

        // Calling the add method using the method reference
        additionMethodReference.add(a, b);

        // Using a lambda expression to call the add method
        Addition additionLambda = (x, y) ->  new AdditionImpl(a, b);
        additionLambda.add(a, b);

        // Close the Scanner to free resources
        scanner.close();
    }
}
