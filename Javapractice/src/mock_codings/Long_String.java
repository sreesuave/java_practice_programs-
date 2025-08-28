package mock_codings;
import java.util.*;
public class Long_String {
	public static String longStringinput(String input)
	
	{
		StringBuilder s = new StringBuilder(input);
	
		
			 String long_string = "";
			String words [] = s.toString()	.split(" ")		;
			for(String word : words)
			{
				
				if(word.length() > long_string.length())
				{
					
					long_string = word;
				}
				
						
			}
			
			return long_string;
		}
		//return null;
		
	

public static void main (String [] args)
{
	Scanner sc = new Scanner(System.in);
	String input = sc.next();
	System.out.println(longStringinput(input));
	//System.out.println("sr");

	

	
}
}
