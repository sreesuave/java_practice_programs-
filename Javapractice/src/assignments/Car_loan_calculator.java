package assignments;
import java.util.Scanner;
public class Car_loan_calculator {

	public static void main(String[] args) {
		try 
		   (Scanner sc = new Scanner(System.in)) {
			Loan_details obj = new Loan_details();
			
			System.out.print("enter the principle amount : " );
			
			obj.setPrincipal_Amount(sc.nextDouble());
			
			System.out.print("enter the time period in months : " );
			obj.setDuration(sc.nextInt());
			
			System.out.print("enter the interest : " );
			
			obj.setInterest_Rate(sc.nextInt());
			// calling calculate method for total Interest , Total Amount & EMI 
			obj.calculate();
			System.out.printf("interest amount is  : ₹ %.2f%n",obj.getTotal_Interest_Payble());
			
			System.out.printf("total amount is  : ₹ %.2f%n ",obj.getTotal_Amount_Payable());

			
			System.out.printf("emi is : ₹ %.2f%n" ,obj.getMonthly_emi());
		}
		

	}

}

class Loan_details
{

	private Double Interest_Rate ;
	

	private int Duration_in_months; 

	private double Principal_Amount ;
	

	private double Total_Interest_Payble ;

	private double Total_Amount_Payable;
	private double Monthly_emi;
// getter and setters 
	public double getTotal_Interest_Payble() {
		return Total_Interest_Payble;
	}

	public void setTotal_Interest_Payble(double total_payable_Interest) {
		this.Total_Interest_Payble = total_payable_Interest;
		
	}

	public double getTotal_Amount_Payable() {
		return Total_Amount_Payable;
	}

	public void setTotal_Amount_Payable(double total_Amount_Payable) {
		this.Total_Amount_Payable =  Total_Interest_Payble + Total_Amount_Payable;
	}

	public double getPrincipal_Amount() {
		return Principal_Amount;
	}

	public void setPrincipal_Amount(double principal_Amount) {
		this.Principal_Amount = principal_Amount;
	}

	public int getDuration() {
		return Duration_in_months;
	}

	public void setDuration(int duration) {
		this.Duration_in_months = duration;
	}

	public Double getInterest_Rate() {
		return Interest_Rate;
	}

	public void setInterest_Rate(double interest_Rate) {
		this.Interest_Rate = interest_Rate;
	}

	
	

	public double getMonthly_emi() {
		return Monthly_emi;
	}

	public void setMonthly_emi(double monthly_emi) {
		this.Monthly_emi = monthly_emi;
	}
	
//implement a calling calculate method for total Interest , Total Amount & EMI 
 public void calculate() {
	 double R = (double) Interest_Rate / (12 * 100); 
	    int N = Duration_in_months; 
	    double P = Principal_Amount;

	    
	    Monthly_emi = (P * R * Math.pow(1 + R, N)) / (Math.pow(1 + R, N) - 1);

	    // Total Payable & Interest
	    Total_Amount_Payable = Monthly_emi * N;
	    Total_Interest_Payble = Total_Amount_Payable - Principal_Amount;

}
}
