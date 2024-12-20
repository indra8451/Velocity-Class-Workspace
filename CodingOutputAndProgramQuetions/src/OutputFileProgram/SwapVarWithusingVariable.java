package OutputFileProgram;

import java.util.Scanner;

public class SwapVarWithusingVariable {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter First Number:");
		int num1=scanner.nextInt();
		System.out.println("Enter Second Number:");
		int num2=scanner.nextInt();
		System.out.println("Before sorting values:"+"First Number:"+num1+" "+"Second Number: "+num2);
		
		num1=(num1+num2)-num1;
		num2=(num1+num2)-num2;
		
		System.out.println("after sorting values:"+"First Number:"+num1+" "+"Second Number: "+num2);

	}

}
