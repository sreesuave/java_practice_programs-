package mock_codings;
import java.util.*;
public class Valid_parenthesis {
	public static  Boolean braces(String input)
	{
		if(input.length()%2==0)
		{
			for(int i=0;i<input.length();i++)
			{
				if(input.charAt(i)==input.charAt(input.length()-i-1));
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println(braces(input));
		
		
	}

}
