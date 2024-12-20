package Assigmnet_9;

/*
 1. Write the Java program in which create the multiple objects and display the count of number of objects created into class. 
 */
public class CountObject {
	
	static int count;
		public  CountObject()
	{
		
		count++;
	}

	public static void main(String[] args) {
		
		CountObject cn= new CountObject();
		CountObject cn1= new CountObject();
		CountObject cn2= new CountObject();
		CountObject cn3= new CountObject();
		CountObject cn4= new CountObject();
		
		System.out.println("Count of object:-"+ count);
	

	}

}
