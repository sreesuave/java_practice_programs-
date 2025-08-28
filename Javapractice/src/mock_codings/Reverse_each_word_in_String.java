package mock_codings;
import java.util.*;
public class Reverse_each_word_in_String {
	public static  String Reversewords(String Input) {
		String[]  Words = Input.split(" ");
		StringBuilder rev = new StringBuilder();
		for(String Word:Words)
		{
			StringBuilder sb = new StringBuilder(Word);
			rev.append(sb.reverse()).append(" ");
		
				
		}
		return rev.toString()
;		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(Reversewords(input));

	}

}
