package Assignments_4;

public class AverageOfFiveNumbers {
	
	public static int average(int a,int b,int c,int d,int e)
	{
		return((a+b+c+d+e)/5);
		
	}

	public static void main(String[] args) {
		int i=10;
		int j=4;
		int k=7;
		int l=100;
		int m=2;
		
		int average=AverageOfFiveNumbers.average(i, j, k, l, m);
		
		System.out.println("The average of total 5 object is :-"+ average);

	}

}
