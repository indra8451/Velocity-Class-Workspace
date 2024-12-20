package FlatMap;

import java.util.*;import java.util.stream.Collector;
import java.util.stream.Collectors;

class Address {
    String street;

    Address(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return street;
    }
}

class Person {
    String name;
    List<Address> addresses;

    Person(String name, List<Address> addresses) {
        this.name = name;
        this.addresses = addresses;
    }
}

public class FlatMapExample {
    public static void main(String[] args) {
        // Create some sample addresses
        Address address1 = new Address("123 Main St");
        Address address2 = new Address("456 Elm St");
        Address address3 = new Address("789 Oak St");

        // Create some persons with their addresses
        Person person1 = new Person("John", Arrays.asList(address1, address2));
        Person person2 = new Person("Alice", Arrays.asList(address3));
        Person person3 = new Person("Bob", Arrays.asList(address1, address3));

        // List of persons
        List<Person> persons = Arrays.asList(person1, person2, person3);
        

        // Using flatMap to flatten the stream of addresses
        persons.stream()
                .flatMap(person -> person.addresses.stream()) // Flatten the addresses of each person
                .forEach(System.out::println); // Print each address
    }
}

