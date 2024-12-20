package DiamondOperator;

import java.util.ArrayList;
import java.util.List;

public class Test {

    // List without generics
    List l = new ArrayList();

    public Test() {
        l.add("Har Har Mahadev!!!!!!!!!!");
        l.add(3);
        l.add(new Employee("Indrajit Chavan"));
    }

    public void getData() {
        String message = (String) l.get(0); // Safe, as l.get(0) is a String
        System.out.println(message);

        // Causes a ClassCastException at runtime because l.get(1) is an Integer, not a String
        String number = (String) l.get(1); 
        System.out.println(number);

        Employee emp = (Employee) l.get(2); // Safe, as l.get(2) is an Employee
        System.out.println(emp);
    }

    public static void main(String[] args) {
        Test test = new Test();
        try {
            test.getData();
        } catch (ClassCastException e) {
            System.out.println("Caught a ClassCastException: " + e.getMessage());
        }
    }
}
