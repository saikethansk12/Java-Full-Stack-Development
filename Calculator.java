package loancalculator;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Double amount=0.0,interestRate=0.0;
        Integer tenure=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Loan Amount: ");
        amount = sc.nextDouble();
        System.out.println("rate of interest: ");
        interestRate = sc.nextDouble();
        System.out.println("Loan Tenure: ");
        tenure = sc.nextInt();
        interestRate=interestRate/(12*100);
        tenure=tenure*12;
        Double interestAmount = 0.0;
        Double totalRepayment = 0.0;
        Double emiPerMonth = (amount*interestRate*Math.pow(1+interestRate,tenure))/(Math.pow(1+interestRate,tenure)-1); // calculation of emi per month
        totalRepayment = emiPerMonth*tenure; // total repayment amount to be paid
        interestAmount = totalRepayment-amount; // interest amount paid in excess
        System.out.println(" EMI to be paid is: "+emiPerMonth);
        System.out.println("total interest paid is: "+interestAmount);
        System.out.println("total repayment  amount to be done is: "+totalRepayment);
        sc.close();
    }
}