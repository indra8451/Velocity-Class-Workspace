package groupingBy;

import java.util.*;
import java.util.stream.Collectors;

class Citizen {
	private String name;
	private int age;

	public Citizen(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Citizen [name=" + name + ", age=" + age + "]";
	}

}

public class GroupByNameMaxAgeExample {
	public static void main(String[] args) {

		List<Citizen> citizenList = Arrays.asList(new Citizen("Amit", 25), new Citizen("Amit", 30),
				new Citizen("Priya", 30), new Citizen("Priya", 35), new Citizen("Vikram", 25),
				new Citizen("Vikram", 40), new Citizen("Anita", 28));

		citizenList.stream()
				.collect(Collectors.groupingBy(citizen -> citizen.getName(),
						Collectors.maxBy(Comparator.comparingInt(citizen -> citizen.getAge()))))
				.forEach((name, age) -> System.out.println("Name: " + name + " " + "Age" + age));

	}
}
