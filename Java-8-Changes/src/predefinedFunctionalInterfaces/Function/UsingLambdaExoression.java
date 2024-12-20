package predefinedFunctionalInterfaces.Function;

import java.util.Scanner;

//Functional interface for multiplying a number
@FunctionalInterface
interface MultiplicationOperation {
 Integer multiply(int number);
}

//Functional interface for reversing a string
@FunctionalInterface
interface StringReverser {
 String reverse(String str);
}

public class UsingLambdaExoression {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Multiplication operation
     System.out.println("Enter a number to multiply: ");
     int number = scanner.nextInt();

     MultiplicationOperation multiplication = num -> num * num;
       
     Integer result=multiplication.multiply(number);
     
     System.out.println("Square of the given number " + number + " is: " + result);

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
        return reversed;
     };

    String result2= reverser.reverse(inputString);
    
    System.out.println("Reversed string is: " + result2);
     
     scanner.close();
 }
}
