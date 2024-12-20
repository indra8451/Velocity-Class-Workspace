package Stream_API.MapAndCollect;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
    

}


public class PeopleCollector {
	
	public static void main(String[] args) {
		
		List<Person> personlist= new ArrayList<Person>();
		
		personlist.add(new Person("Alice", 25));
		personlist.add(new Person("Bob", 30));
		personlist.add(new Person("Charlie", 28));
		
		System.out.println("Before transforming: ");
		System.out.println(personlist);
		
		Map<String, Integer> personmap=personlist.stream().collect(Collectors.toMap(Person::getName, Person::getAge));

		System.out.println("\nAfter transforming: ");
		
		System.out.println(personmap);
		
	}

}

