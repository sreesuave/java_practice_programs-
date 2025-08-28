package mock_codings;
import java.util.*;
public class Rotated_Strings {

	public static boolean Rotate(String input1,String input2)
	{
		String input3 = input2+input2;
		if(input1.length()==input2.length())
		{
			if(input3.contains(input1))
			{
				return true;
				
			}
		}
		return false;
		
		
	}
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		String input1 = sc.next();
		String input2 = sc.next();
		System.out.println(Rotate(input1,input2));
	
		
	}
}
