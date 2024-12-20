package Pattern;

import java.util.Scanner;

/*    
enter the no:-
11
           
          *
         **
        ***
       ****
      *****
     ******
    *******
   ********
  *********
 ********** 
*/
public class Pattern1 {

	public static void main(String[] args) {


		System.out.println("enter the no:-");
		Scanner scannner= new Scanner(System.in);
		int no= scannner.nextInt();
		int right=no;
		for(int i=0;i<no;i++)
		{
			
			for(int j=0;j<no;j++)
			{
				if(j>=right)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			right--;
		}
		
	}

}
