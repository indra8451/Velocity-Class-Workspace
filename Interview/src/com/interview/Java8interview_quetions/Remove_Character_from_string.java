package com.interview.Java8interview_quetions;



public class Remove_Character_from_string {

	public static void main(String[] args) {
		
		String str="vinayaka";
		String str1="";
		int len=str.length();
		
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)!='a')
			{
				
				str1=str1+str.charAt(i);
					
				}
			}
		 System.out.println(str1);
		}
		
		
		
		      
	}


