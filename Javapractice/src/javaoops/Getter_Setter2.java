package javaoops;
 class ex1{
	private String Account_Name = "sree";
	private int Account_Number = 123456;
	private int Account_pin ;
 
 void bank_details(String Account_Name , int Account_Number, int Account_pin)
{
	this.Account_Name = Account_Name;
	this.Account_Number = Account_Number;
	this.Account_pin = Account_pin;
}
public String getAccount_Name() {
    return Account_Name;

}
public int  getAccount_Number() {
    return Account_Number;
}
public boolean valid_Account_pin(int check_pin)
{
	return this.Account_pin == check_pin;
}
}
public  class Getter_Setter2 {

	public static void main(String[] args) {
		ex1 e = new ex1();
		e.bank_details("sai", 173865, 5622);
		System.out.println(e.getAccount_Name());
		
		System.out.println(e.getAccount_Number());
		int sample_pin = 4578;
		if(e.valid_Account_pin(sample_pin))
		{
			System.out.println("pin matched");
		}
		else
		{
			System.out.println("Invalid pin");
		}
	
	}

}
