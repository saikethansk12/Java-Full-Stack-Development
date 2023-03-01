package loancalculator;
import java.util.Scanner;

public class MinimumBalance {

    public static void main(String[] args){
        Double[] accBalance = new  Double[20];              //array is declared
        System.out.println("Enter 20 different account balances: ");
        Scanner sc = new Scanner(System.in);                //Scanner statement
        for(int i=0; i<20 ; i++){
            accBalance[i]=sc.nextDouble();
        }
        MinimumBalance check = new MinimumBalance();
        check.updateBalance(accBalance);
        System.out.println(" Balances after charge deduction are:");
        for(int i=0;i<20;i++){
            System.out.print(accBalance[i]+" ");            //displaying the balances after charge deduction
        }
    }
    public void updateBalance(Double[] accBalance) {
        for(int i=0; i<20 ; i++){
            if (accBalance[i]<10000){
                if (accBalance[i]>=5000){                   //checks if the balance is between 5000 & 9999
                    accBalance[i]-=accBalance[i]*0.03;      //deducts 3% from the balance
                }
                else if(accBalance[i]>=1000){               //checks if the balance is between 1000 & 4999
                    accBalance[i]-=accBalance[i]*0.05;      //deducts 5% from the balance
                }
            }
        }

    }
}
