package javaoops;
interface printable{
	void print();
}
interface scanable{
	void scan();
}
class Dual implements printable,scanable {
	public void print()
	{
		System.out.println("printing is working");
	}
	public void scan()
	{
		System.out.println("scanning is working");
	}
}
 class Interface2 {

	public static void main(String[] args) {
		Dual d = new Dual();
		d.print();
		d.scan();

	}

}
