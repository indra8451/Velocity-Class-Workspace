package FinalKeyword;
public class ExampleFinalVariable {

    // Declare instance variables here if needed
    private final int exampleVar;

    // Constructor
    public ExampleFinalVariable(int exampleVar) {
        this.exampleVar = exampleVar;
    }
	
    public static void main(String[] args) {
        // Create an instance of ExampleFinalVariable
        ExampleFinalVariable example = new ExampleFinalVariable(10);
        System.out.println("Example variable value: " + example.exampleVar);
    }
}

