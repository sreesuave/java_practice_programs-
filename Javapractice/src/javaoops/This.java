package javaoops;
class Ex{
	int id = 101;
	String name = "sree";
	void print(int id,String name)
	{
		
		this.id = id;
		this.name = name;
		System.out.println("id "+id+ " name "+name);
	}
}
public class This {

	public static void main(String[] args) {
		Ex e = new Ex();
		e.print(101,"sai");
		//System.out.println(name);
	}

}
