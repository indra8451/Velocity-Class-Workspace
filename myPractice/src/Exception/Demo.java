package Exception;

public class Demo {

	public static void main(String[] args) {
		
		// 1. try block without catch or finally - not allowed
		/*try {
			// not allowed: try block must be followed by either catch or finally
		}
		*/
		// 2. try block with catch block - allowed
		try {
			// allowed: try block followed by catch block
		}
		catch(Exception e){
			// handle exception
		}
		
		// 3. try block with finally block - allowed
		try {
			// allowed: try block followed by finally block
		}
		finally{
			// cleanup code, always executes
		}
		
		// 4. try block with both catch and finally blocks - allowed
		try {
			// allowed: try block followed by both catch and finally blocks
		}
		catch (Exception e){
			// handle exception
		}
		finally{
			// cleanup code, always executes
		}
		
		// 5. try block with multiple catch blocks (correct syntax is 'catch' not 'Catch') - allowed
		try {
			// allowed: try block followed by multiple catch blocks
		}
		catch(ArithmeticException e1){
			// handle ArithmeticException
		}
		catch(Exception e){
			// handle all other exceptions
		}
		
		// 6. try block with multiple catch blocks in the wrong order (more specific first) - not allowed
		try {
			// not allowed: Exception should be caught after more specific exceptions
		}
		catch(Exception e){
			// handle all exceptions
		}
		/*catch(ArithmeticException e1){
			// this catch block is unreachable since Exception has already caught all exceptions
		}
		*/
		// 8. try block with multiple catch blocks in correct order (more specific first) - allowed
		try {
			// allowed: try block followed by multiple catch blocks in correct order
		}
		catch(ArithmeticException e){
			// handle ArithmeticException
		}
		catch(Exception e1){
			// handle all other exceptions
		}
	}

}
