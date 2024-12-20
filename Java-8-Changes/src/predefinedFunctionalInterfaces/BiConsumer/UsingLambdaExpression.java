package predefinedFunctionalInterfaces.BiConsumer;

interface Sample {

	void printNameWithAge(String Name, int age);
}

public class UsingLambdaExpression {

	public static void main(String[] args) {

		Sample sample = (Name, age) -> System.out.println(Name + " is " + age + " years old.");

		sample.printNameWithAge("Lorenzo", 34); //Lorenzo is 34 years old.

		sample.printNameWithAge("Indrajit", 29); //Indrajit is 29 years old.
	}

}
