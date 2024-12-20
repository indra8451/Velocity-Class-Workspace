package CollectionEnhancement.forEach_Method;
import java.util.ArrayList;
import java.util.List;

public class AfterJAVA8_Using_forEach_Method {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("pune");
		list.add("mumbai");
		list.add("bangalore");
		list.add("delhi");

		/*
		  list.forEach((String city)->{
		  
		  System.out.println(city); });
		  
		 */
		
		// Above is working fine but Since there is only one parameter in the
		// parentheses `()` and a single statement in `{}`, we can remove the `{}` as
		// well.

		System.out.println("############################# Using forEach Method ##################################################");

		list.forEach(city -> System.out.println(city)); // only in one line

	}
}
