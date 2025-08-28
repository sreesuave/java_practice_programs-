package mock_codings;
import java.util.*;
public class Anagrams {
	public static Boolean anagram(String input1, String input2)
	{
		char []ch1 = input1.toCharArray()
;
		char [] ch2 = input2.toCharArray()
;
		
		
		if(ch1.length==ch2.length)
		{
			Arrays.sort(ch2);
			Arrays.sort(ch1);
			
			        return Arrays.equals(ch1, ch2);
			
			
			
		}
		
		return false;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	String	intput1 = sc.next();
	String	intput2 = sc.next();
	sc.close();
	System.out.println(anagram(intput1,intput2));

		
		
		 
		
	}

}
