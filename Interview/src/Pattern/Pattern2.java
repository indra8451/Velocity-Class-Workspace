package Pattern;

/*enter the no:-
5

* 
* * 
* * * 
* * * * 
* * * * * 

*/
import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		System.out.println("enter the no:-");
		Scanner scannner= new Scanner(System.in);
		int no= scannner.nextInt();
		for(int i=0;i<no;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println("");
		}
	}

}
