package sample;
class ex
{
	private String name = "sree";
	int id = 101;
	void display()
	{
		System.out.println("private variable "+name);

		System.out.println("default variable "+id);
		
	}
	
	
}

public class Private_Default {

	public static void main(String[] args) {
		ex e = new ex();
		e.display();
	}

}
