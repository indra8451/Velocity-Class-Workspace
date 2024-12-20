package FlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class InfosysInterviewQuetion1 {

	public static void main(String[] args) {

		List<List<String>> listofList = new ArrayList<>();

		listofList.add(Arrays.asList("Java", "Spring", "Spring Boot"));

		listofList.add(Arrays.asList("React", "Angular", "Java Script"));

		listofList.add(Arrays.asList("MySQl", "JDBC", "Oracle"));

		// System.out.println(listofList);

		listofList.stream().flatMap(stream -> stream.stream()).filter(element -> element.startsWith("J"))
				.forEach(element -> System.out.println(element));

	}

}
