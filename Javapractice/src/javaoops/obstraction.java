package javaoops;

abstract class abstraction {
	abstract void example();
	
   void runs()
   {
	   System.out.println(" its concentarte method running in abstract class");
   }
}
	class test extends abstraction {
		void example()
		{
			System.out.println("testing purpose");
		}
		void runs()
		{
			System.out.println("  method running in abstract class");
		}
	}
	public class obstraction {
		
	
	public static void main(String[] args) {
		
		test abs = new test();
		abs.example();
		abs.runs();
		
	}

}
