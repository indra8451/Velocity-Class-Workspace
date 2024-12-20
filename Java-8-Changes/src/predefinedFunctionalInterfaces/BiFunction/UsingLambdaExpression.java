package predefinedFunctionalInterfaces.BiFunction;

@FunctionalInterface
interface Sample{
	
	int addition(int a,int b) ;
}

@FunctionalInterface
interface Combine{
	
	String concatination(String s1, String s2);
}

public class UsingLambdaExpression {
	
	public static void main(String[] args) {
		
		//Addition of two numbers
		Sample sample=(a,b)-> a+b;
		
		sample.addition(20, 30);
		
		System.out.println(sample.addition(1000, 2000));  //3000
		
		System.out.println(sample.addition(1, 2));    //3
		
		//Concatenation of two Strings
		Combine combine=(s1,s2)->s1+" "+s2;
		
		System.out.println(combine.concatination("Indrajith", "Chavan")); // Indrajith Chavan
	} 
	

}
