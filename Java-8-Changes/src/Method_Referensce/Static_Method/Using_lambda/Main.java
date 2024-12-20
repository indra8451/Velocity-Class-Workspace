package Method_Referensce.Static_Method.Using_lambda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input from the user
        System.out.println("Enter the 1st number: ");
        int a = scanner.nextInt();

        System.out.println("Enter the 2nd number: ");
        int b = scanner.nextInt();
        
       Addition addition=(c,d)->AdditionImpl.add(a, b);
      
       addition.add(a, b);
       
        
        scanner.close();
    }
}
