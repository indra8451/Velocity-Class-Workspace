package Method_Referensce.Constructor_Reference.Using_lambda;

// Class that performs the addition operation
public class AdditionImpl {
    private int a;
    private int b;

    // Constructor to initialize values
    public AdditionImpl(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Sum: " + (a + b));
    }
}
