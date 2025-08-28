package javaoops;
class Baseclass
{
	static int a = 10;
	
}

class Subclass extends Baseclass
{
	static int b = 20;
	int display()
	{
		return a+b;
	}
}
public class Inhertance {

	public static void main(String[] args) {
		Subclass a = new Subclass();
		System.out.println(a.display());

	}

}
