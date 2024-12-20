package groupingBy;

import java.util.*;
import java.util.stream.Collectors;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class GroupByAge {
    public static void main(String[] args) {
        // List of people with their ages
        List<Person> people = Arrays.asList(
            new Person("Amit", 25),
            new Person("Priya", 30),
            new Person("Vikram", 25),
            new Person("Anita", 28),
            new Person("Rahul", 30),
            new Person("Sneha", 28)
        );

        // Group people by age and count the number of people in each age group
        Map<Integer, Long> ageGroupCount = people.stream()
            .collect(Collectors.groupingBy(person->person.getAge(), Collectors.counting()));

        // Print the result
        ageGroupCount.forEach((age, count) -> System.out.println("Age " + age + ": " + count + " people"));
    }
}

