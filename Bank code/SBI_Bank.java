import java.util.Scanner;

public class SBI_Bank extends Person {
    private int branch;
    protected int Balance;
    private int account, account_name;
    private String IFSC;
    private String a, b;
    int ch;
    

    Scanner sc = new Scanner(System.in);

    public void CreateAccount() {
        do {

            System.out.println("1.CURRENT ACCOUNT\n2.SAVING ACCOUNT");
            account = sc.nextInt();
            if (account == 1) {
                a = "Current account";
            } else if (account == 2) {
                a = "Saving account";
            }
            System.out.println("Select from following branches\n1.Wakad\n2.Viman Nagar\n3.Shivaji Nagar");
            branch = sc.nextInt();
            // IFSC=sc.next();
            if (branch == 1) {
                IFSC = "SBIN0016542";
                b = "Wakad";
                System.out.println(b + " " + IFSC);
            } else if (branch == 2) {
                IFSC = "SBIN0011699";
                b = "Viman Nagar";
                System.out.println(b + " " + IFSC);
            } else if (branch == 3) {
                IFSC = "SBIN0018093";
                b = "Shivaji Nagar";
                System.out.println(b + " " + IFSC);
            }
            System.out.println("Do you want to change the branch:\n" + "1.YES\n" + "2.NO");
            ch = sc.nextInt();

        } while (ch == 1);

    }

    public void limit() {
        System.out.println("Minimum amount to be deposited to create account is 1000Rs");
        System.out.println("Enter amount :");
        Balance = sc.nextInt();
        System.out.println("Bank balance is=" + Balance);
    }

    public void outcomes() {

        System.out.println("Account Type : " + a);
        System.out.println("Branch of Bank :" + b);
        System.out.println("IFSC-CODE :" + IFSC);

    }

}
