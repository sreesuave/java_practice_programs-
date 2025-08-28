package mock_codings;
import java.util.*;
public class Duplicate_String {
	public  static String DuplicateString(String input)
		
		{
		 Set<Character> set = new HashSet<>();
		 for(int i=0;i<input.length();i++)
		 {
			 String sr = "";
			set.add(input.charAt(i));
		
			
		 }
		 
			return set.toString();
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println(DuplicateString(input));
  
	}

}
