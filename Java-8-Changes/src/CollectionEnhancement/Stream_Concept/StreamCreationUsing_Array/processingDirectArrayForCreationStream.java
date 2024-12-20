package CollectionEnhancement.Stream_Concept.StreamCreationUsing_Array;

import java.util.Arrays;

public class processingDirectArrayForCreationStream {
	
	public static void main(String[] args) {
		
		String namearr[]= {"vishal","kiran","indrajit","vinayak"};
		
		System.out.println("Array of names:");
		Arrays.stream(namearr).forEach(name->System.out.println(name));
		
		
	}
	
			
			

}
