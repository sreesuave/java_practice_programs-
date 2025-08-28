package xceptionsEx;

public class ExceptionExample {

	public static void main(String[] args) {
		int a = 10, b = 0;
        int result;

        try {
            result = a / b;  
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("exception Cannot divide by zero.");
        } finally {
            System.out.println("Program ends here.");
        }
    }


	}


