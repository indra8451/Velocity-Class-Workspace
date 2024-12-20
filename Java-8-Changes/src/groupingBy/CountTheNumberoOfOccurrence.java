package groupingBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountTheNumberoOfOccurrence {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("ajay");
		list.add("sachin");
		list.add("ram");
		list.add("vaibhav");
		list.add("ram");

		System.out.println("1st way");
		list.stream().collect(Collectors.groupingBy(name -> name, Collectors.counting())).forEach((name, count) -> {

			System.out.println("name: " + name + " " + "count: " + count);
		});

		System.out.println("2nd way");
		Map<String, Long> nameCountMap = list.stream()
				.collect(Collectors.groupingBy(name -> name, Collectors.counting()));

		nameCountMap.forEach((name, count) -> System.out.println("name: " + name + " " + "count: " + count));

	}

}
