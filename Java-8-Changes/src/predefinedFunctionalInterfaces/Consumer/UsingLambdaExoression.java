package predefinedFunctionalInterfaces.Consumer;

import java.util.Scanner;

// Functional interface for multiplying a number
@FunctionalInterface
interface MultiplicationOperation {
    void multiply(int number);
}

// Functional interface for reversing a string
@FunctionalInterface
interface StringReverser {
    void reverse(String str);
}

public class UsingLambdaExoression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Multiplication operation
        System.out.println("Enter a number to multiply: ");
        int number = scanner.nextInt();

        MultiplicationOperation multiplication = num -> 
            System.out.println("Square of the given number " + num + " is: " + (num * num));

        multiplication.multiply(number);

        System.out.println("###############################################################################################");

        // String reversal operation
        // Clear newline left by nextInt()
        scanner.nextLine(); 
        
        System.out.println("Enter a string to reverse: ");
        String inputString = scanner.nextLine();

        StringReverser reverser = str -> {
            String reversed = " ";
            for (int i = str.length() - 1; i >= 0; i--) {
                reversed += str.charAt(i);
            }
            System.out.println("Reversed string is: " + reversed);
        };

        reverser.reverse(inputString);
        
        scanner.close();
    }
}
