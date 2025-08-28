package programms_ex;
import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
		ArrayList<Integer> List = new ArrayList<>();
		List.add(1);
		List.add(2);
		List.add(3);
		List.add(4);
		List.add(5);
		List.add(6);
		List.add(7);

		//System.out.println(List.get(0));
		for(int i :List)
		 System.out.println(i);
		List.remove(0);
		System.out.println("===========================");
		for(int i :List)
			 System.out.println(i);
		System.out.println("===========================");

		
		 System.out.println(List.size());

		
			
		
		
	}

}
