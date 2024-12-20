package OutputFileProgram;

/*How can u write dynamically from 1 to 10 elements without using integrator or for loops 
or any types of loops
*/

public class Print1to10WithoutLoop {
	
	static int i;
	public  static void addition() {
		
		
		if(i>=10)
		{
			System.exit(0);
		}
		else
		{
			i++;
			System.out.println(i);
		}
		
		addition();
	}

	public static void main(String[] args) {
	
		addition();
	}

}
