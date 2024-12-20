package com.interview.programs_onString;

public class SortString_StartotMiddle_Then_MiddletoLast {
	
	public static String sortString(String word)
     {
     	String str="";
     	
     	for(int i=word.length()-1;i>=0;i--)
     	{
     		str=str+word.charAt(i);
     		
     	}
     	
     	return str;
     }
	
    public static void main(String[] args) {
        String input = "words";
        System.out.println("Given String :"+input);		
      
        String result = input.substring(0, input.length()/2);
        String result2=input.substring(input.length()/2,input.length());
       
         
        System.out.println(result);
        System.out.println(result2);
        
        String Sort_String=sortString(result)+sortString(result2);
        System.out.println("Sorted String :"+Sort_String);
        
       
}
    
    
}