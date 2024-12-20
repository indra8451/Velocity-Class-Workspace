package Assigment16.program;

public class Product {
	
	
	private static int weight=100;

	public static int getWeight() {
		return weight;
	}

	
	
	public void productCheck(int weight) 
	{
		
		 if(weight<Product.getWeight())
		   {
			   throw new ProductException("Weight must be Greater than 100");
		   }
		 else
		 {
			 System.out.println("Provided weight is correct "+ weight);
		 }
	}

}
