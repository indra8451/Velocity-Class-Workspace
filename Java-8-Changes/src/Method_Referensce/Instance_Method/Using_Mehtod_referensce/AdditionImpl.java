package Method_Referensce.Instance_Method.Using_Mehtod_referensce;

// Class that implements the Addition interface
public class AdditionImpl implements Addition {

    @Override
    public void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
}
