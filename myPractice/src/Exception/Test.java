package Exception;

public class Test {
	
	public static void main(String[] args) 
	{
		// without exception
		/*  
		System.out.println("First line");
		System.out.println("Second line");
		System.out.println("Third line");
		*/
		
		// with exception code without handling
		
		/*System.out.println("First line");
		System.out.println("Second line");
		System.out.println("Third line");
		int a = 10 / 0;
		System.out.println("Fourth line");
		System.out.println("Fifth line");*/
		
		// with exception code with handling 
		
		System.out.println("First line");
		System.out.println("Second line");
		System.out.println("Third line");
		try {
		int a = 10 / 0;
		} catch (Exception e) {
		System.out.println(e);
		}
		System.out.println("Fourth line");
		System.out.println("Fifth line");

		
		
		}


}
