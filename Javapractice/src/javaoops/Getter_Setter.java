package javaoops;
class employee
{
	private  int id = 101;
	private   String name = "sree";
	private double salary = 23000.00;
	void setid(int id)
	{
		this.id = id;
	}
	void setname(String name)
	{
		this.name = name;
	}
	void setsalary(double salary)
	{
		this.salary= salary;
	}
	 public int getId() {
	        return id;
	    }

	    
	    public String getName () {
	        return name;
	    }
	    public double getsalary()
	    {
	    	return salary;
	    }
	    
}
public class Getter_Setter {

	public static void main(String[] args) {
		employee obj = new employee();
		 obj.setid(202);
	        obj.setname("sai");
	        obj.setsalary(18000);
	        System.out.println("ID : " + obj.getId());
	        System.out.println("Name : " + obj.getName());
	        System.out.println("salary : " + obj.getsalary());

	}

}
