package mock_codings;
import java.util.*;
public class ReverseString {
	public static String ReverseStrings(String input)
	{
		StringBuilder sb = new StringBuilder(input);
				
		return sb.reverse().toString();
		
	}

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
String input = sc.nextLine();
System.out.println(ReverseStrings(input));

	}

}
