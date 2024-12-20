package Pattern;

public class OverloadExample {

    // Method with Object parameter
    void print(Object obj) {
        System.out.println("Object version called");
    }

    // Overloaded method with Double parameter
    void print(Double num) {
        System.out.println("Double version called");
    }

    public static void main(String[] args) {
        OverloadExample example = new OverloadExample();
        example.print(null);  // Compilation error: ambiguous method call
    }
}

