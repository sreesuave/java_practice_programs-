package assignments;
import assignments.Loan_details;
import java.util.Scanner;

public class CarLoanEMI
{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
            Loan_details obj = new Loan_details();

            System.out.print("enter the principal amount: ");
            String principalStr = sc.nextLine();
            double principal = Double.parseDouble(principalStr);
            obj.setPrincipal_Amount(principal);

            System.out.print("enter the time duration in months: ");
            String durationStr = sc.nextLine();
            int duration = Integer.parseInt(durationStr);
            obj.setDuration(duration);

            System.out.print("enter the interest: ");
            String interestStr = sc.nextLine();
            double rate = Double.parseDouble(interestStr);
            obj.setInterest_Rate(rate);

            obj.calculate();

            System.out.printf("interest amount is  : ₹ %.2f%n", obj.getTotal_Interest_Payble());
            System.out.printf("total amount is     : ₹ %.2f%n", obj.getTotal_Amount_Payable());
            System.out.printf("emi is              : ₹ %.2f%n", obj.getMonthly_emi());
       sc.close();
        }
    }


