import java.util.Arrays;
import java.util.HashMap;

public class NestedDemo1 {
	public static void main(String[] args) {
// just wanted to know inner class inside HashMap
		System.out.println(HashMap.class.getNestMembers());
		System.out.println(Arrays.toString(HashMap.class.getNestMembers()));
	}
}