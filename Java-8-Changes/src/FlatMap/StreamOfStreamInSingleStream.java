package FlatMap;

import java.util.stream.Stream;

public class StreamOfStreamInSingleStream {
	public static void main(String[] args) {
		// Creating a stream of streams of strings
		Stream<Stream<String>> streamOfStreams = Stream.of(Stream.of("A", "B", "C"), Stream.of("D", "E", "F"),
				Stream.of("G", "H", "I"));

		System.out.println("After Applying  Stream:");
		// Flattening the stream of streams into a single stream
		streamOfStreams.flatMap(stream -> stream) // Flatten each inner stream into a single stream
				.forEach(element -> System.out.println(element)); // Print each element in the flattened stream
	}
}
