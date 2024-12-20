package predefinedFunctionalInterfaces.Supplier;

import java.util.Date;
import java.util.function.Supplier;

public class UsingSupplierInterface {
	
	public static void main(String[] args) {
		
		//Ex1 getting Current DateTime using Supplier Interface

		Supplier<Date> supplier=()->new Date(); // here Date is return type because  we getting Date so we write Supplier<Date>
		
		
		System.out.println(supplier.get());
		
		//Ex2 getting String using Supplier Interface
		
		Supplier<String> supplier1= ()->"Java is Fabulous programing language"; 
		
		// here String is return type because  we getting Date so we write Supplier<String>
		
		System.out.println(supplier1.get());
	}

}
