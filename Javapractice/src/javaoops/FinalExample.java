package javaoops;
 class Example {

    final int speedLimit = 60;
 final void show()
 {
        System.out.println("Speed limit is: " + speedLimit);
    }

    
}

public class FinalExample {

	public static void main(String[] args) {
	 Example obj = new Example();
        obj.show();
        //obj.speedLimit = 100;

		

	}

}
