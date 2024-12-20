package ImmutableCollection;

import java.util.Map;

public class FactoryMethodMapDemo {
	public static void main(String[] args) {
		Map<String, String> m = Map.of("India", "INR", "Japan", "Yen", "Spain", "Euro");
		m.put("Thailand","baht");
		System.out.println(m);
	}
}
