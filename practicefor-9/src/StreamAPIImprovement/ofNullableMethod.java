package StreamAPIImprovement;

import java.util.stream.Stream;

public class ofNullableMethod {

	public static void main(String[] args) {

		long count = Stream.ofNullable(25).count(); // Non-null element

		System.out.println(count); // Output : 1

		count = Stream.ofNullable(null).count(); // Null element

		System.out.println(count); // Output : 0

		Stream<Integer> stream = Stream.of(null); // Using of Method getting NullPointerException

		System.out.println("Stream size:" + stream.count());
	}

}
