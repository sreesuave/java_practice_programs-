package javaoops;

interface payment {
	void pay (double amount);
	
}
class Creditcard implements payment
{
	public void pay (double amount)
	{
		System.out.println("paid with credir card"+amount);
	}
}
class upi implements payment
{
	public void pay (double amount)
	{
		System.out.println("paid with upi "+amount);
	}
}
class crypto_wallet implements payment
{
	public void pay (double amount)
	{
		System.out.println("paid with crypto_wallet "+amount);
	}
}

public class Interface {
	public static void main(String [] args)
	{
		payment pay;
		pay = new Creditcard();
		pay.pay(185.5);
		pay = new upi();
		pay.pay(9898.654);
		pay = new crypto_wallet();
		pay.pay(500);
				
				
	}

}
