package xceptionsEx;

public class ThrowExample {

	public static void main(String[] args) {
		 int age = 16;
	        if (age < 18) {
	            throw new ArithmeticException("still not major");
	        } else {
	            System.out.println("Eligible to vote");
	        }

	}

}
