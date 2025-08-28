package javaoops;
class Calculas 
{
	public int result(int a ,int b)
	{
		return a+b;
	}
	public double result(double a ,double  b)
	{
		return a + b;
	}
	 public String result (String s) 
	 {
		 return s;
	 }
}
class Overrideex extends Calculas{
	public int result(int a,int b)
	{
		System.out.println("@overridde method calling ");
		return a*b;
	}
	
}


public class polymorphismEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculas  cal = new Calculas();
System.out.println("overloaded method calling : ");
System.out.println(cal.result(10,20));
System.out.println(cal.result(15.0,200.25));

Overrideex cals = new Overrideex();
System.out.println(cals.result(10,20));
	}

}
