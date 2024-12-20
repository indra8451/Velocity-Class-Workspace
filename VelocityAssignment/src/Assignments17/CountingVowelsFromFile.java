package Assignments17;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
public class CountingVowelsFromFile {

	static int count=0;
	static int Totalvowelcount=0;
	public static void main(String[] args) throws IOException {
		
		FileInputStream fileinputstream=null;
		Scanner scanner=null;
		
		try {
			 fileinputstream= new FileInputStream("C:\\Users\\Admin\\Desktop\\java_velocity_notes\\"
					                                            + "velocity_workspace\\Velocity\\src\\Assignments17\\abc.txt");
			
			 scanner= new Scanner(fileinputstream);
			
			while(scanner.hasNextLine())
			{
				String line=scanner.nextLine();
				
				
				System.out.println(">>>>>>>>>>>>>>>>>>New line<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
				int length=line.length();
				System.out.println(line);
				System.out.println("Length of line:-"+length);
				
				for(int i=0;i<line.length();i++)
				{
					
					char ch=line.toLowerCase().charAt(i);
					switch(ch)
					{
					case 'a':
						count++;
						//System.out.println(ch);
						break;
					case 'e':
						count++;
						//System.out.println(ch);
						break;
					case 'i':
						count++;
						//System.out.println(ch);
						break;
					case 'o':
						count++;
						//System.out.println(ch);
						break;
					case 'u':
						count++;
						//System.out.println(ch);
						break;
					
					}
					
					/*if(ch=='a' ||ch=='e' ||ch=='i' || ch=='o' || ch=='u')
					{
						Totalvowelcount++;
					}*/
		
				}
				
 				System.out.println("Vowels count at present line:-"+count);
				Totalvowelcount=Totalvowelcount+count;
			     count=0;
				
			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		finally
		{
			fileinputstream.close();
			scanner.close();
			System.out.println(">>>>>>>>>>>>>>>>>>Total Vowel Count In The File<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
			System.out.println("Total Vowel Count In The File:- "+Totalvowelcount);
		}
		
		

	}

}
