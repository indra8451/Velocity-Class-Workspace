package CollectionEnhancement.filter_Method.OnCollection;

import java.util.Arrays;
import java.util.List;

public class PrintingEvenOddNumbersFromList {
	
	public static void main(String[] args) {
		
		List<Integer> numList=Arrays.asList(1,45,6,8,45,67,89,900,23,73,70);
		
		System.out.println("Printing Even Numbers: ");
		numList.stream().filter(num->num%2==0).forEach(num->System.out.println(num));
		
		System.out.println("\nPrinting Odd Numbers: ");
		numList.stream().filter(num->num%2!=0).forEach(num->System.out.println(num));
	}

}
