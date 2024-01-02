import java.util.*;
import java.lang.IndexOutOfBoundsException;

public class Customer extends SBI_Bank {
    private int withdrawal;
    private int deposit;
    // protected static int Balance;
    private int withdrawal_limit = 40000;

    Scanner sc = new Scanner(System.in);

    public void Deposit() {
   {
        System.out.println("Enter amount to be Deposited");
        deposit = sc.nextInt();
        Balance = Balance + deposit;
        System.out.println("Balance=" + Balance);
     }
        
    }

    public void Withdrawal() {

        System.out.println("How many amount to be withdrawal");
        withdrawal = sc.nextInt();
        if (withdrawal > withdrawal_limit) {
            System.out.println("Daily limit is exceeded ");
        } else if (withdrawal > Balance){
            System.out.println("Insufficient Balance");
        } else {
            Balance = Balance - withdrawal;

        }
        System.out.println("Total amount =" + Balance);
        // System.out.println("Enter amount to be Withdrawal");
        // Balance=sc.nextInt();
    }

    public void output() {
        System.out.println("YOUR BALANCE IS " + Balance);
    }

}
