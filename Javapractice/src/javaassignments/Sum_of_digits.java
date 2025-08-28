package javaassignments;
import java.util.Scanner;
public class Sum_of_digits {

	
			
		public static void main (String [] args)
		{
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();
			
			int rev = 0;
			
				while(number!=0)
				{
				int rem = number%10;
				rev = rev+rem;
				number /=10;
			}
			System.out.println("sum of the digits :"+rev);
			}
		}
			


	


