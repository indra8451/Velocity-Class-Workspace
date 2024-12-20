import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class OddNumbers {
	
	public static void main(String[] args) {
		
		List<Integer> l= new ArrayList<>();
		
		l.add(10);
		l.add(25);
		l.add(30);
		l.add(45);
		
		l.stream().filter(Predicate.not(num->num%2==0)).forEach(num->System.out.println(num));
	}

}
