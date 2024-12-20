package RgPractise;

import java.io.Serializable;

public class Substraction implements Myinterface,Cloneable,Serializable
{

	@Override
	public void subtraction(int a, int b) {
		
		System.out.println(a-b);
	}

		public static void main(String[] args) {
			
			Substraction sub= new Substraction();
			sub.subtraction(301, 1);
		}

		
}
