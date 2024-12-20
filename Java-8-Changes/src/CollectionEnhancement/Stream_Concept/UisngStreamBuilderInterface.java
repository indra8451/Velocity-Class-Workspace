package CollectionEnhancement.Stream_Concept;

import java.util.stream.Stream;

public class UisngStreamBuilderInterface {
	
	public static void main(String[] args) {
		
		Stream<String> citystream= Stream.<String>builder().add("pune").add("mumbai").add("delhi").build();
		
		 // Use forEach to print each element in the stream
	    citystream.forEach(city->System.out.println(city));
	}

}
