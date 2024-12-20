package StreamAPIImprovement;

import java.util.stream.IntStream;

public class takeWhileMethod {
	
	public static void main(String[] args) {
		
		IntStream.of(1, 10, 100, 1000, 10000, 1000, 100, 10, 1, 0, 10000)
        .takeWhile(i -> i < 5000)
        .forEach(System.out::println);
	}

}
