package StreamAPIImprovement;

import java.util.stream.Stream;

public class IterateExample {
    public static void main(String[] args) {
        // Generate a stream of even numbers up to 10
        Stream<Integer> evenNumbers = Stream.iterate(0, 
                                               n -> n < 10, 
                                               n -> n + 2);

        evenNumbers.forEach(System.out::println);
    }
}