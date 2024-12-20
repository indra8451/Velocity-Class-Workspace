package Assigment_3;

public class Demo {
	
	
	

	public static void main(String[] args)
	{
		
		String name="Indrajit";
		Demo dobj=new Demo();
		String retrun_name= dobj.getStudentName(name);
		
		System.out.println("The name is:- " + retrun_name);

	}

	public String getStudentName(String name)
	{
		return name;
	}
}
