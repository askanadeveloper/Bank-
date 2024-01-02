import java.util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int  ch=0,x ;
        String id;
        ArrayList<Customer> person_list = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n, i, num;
        do {

            System.out.println("Choose the option from the below :");
            System.out.println("1.Create account\n2.Deposit Money\n3.Withdraw Money\n4.Bank Details");
            x = sc.nextInt();
        
            switch (x)
        
            {
                case 1:
                    Customer c = new Customer();
                    System.out.println("**CREATE A ACCOUNT**");
                    c.CreateAccount();
                    c.getdata();
                    c.limit();
                    person_list.add(c);
                    System.out.println("Enter person id :");
                    id = sc.next();
                    list.add(id);

                    System.out.println("Create account sucessfully.......");
                    break;
                case 2:
                    System.out.println("Enter person id :");
                    id = sc.next();
                    for (i = 0; i<list.size() ; i++) {
                        if (list.get(i).equals(id)) {
                            person_list.get(i).Deposit();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter person id :");
                    id = sc.next();
                    for ( i = 0; i < list.size(); i++) {
                        if (list.get(i).equals(id)) {
                            person_list.get(i).Withdrawal();
                        }
                    }
                    break;
                case 4:
                    System.out.println("...........................................................");
                    System.out.println("Enter person id :");
                    id = sc.next();
                    for ( i = 0; i < list.size(); i++) {
                        if (list.get(i).equals(id)) {
                            person_list.get(i).Display();
                            person_list.get(i).outcomes();
                            person_list.get(i).output();
                        }
                    }

                    
            }
            System.out.println("................................................................");
                    System.out.println("Do you want to continue this process:\n" + "1.YES\n" + "2.NO");
                    ch = sc.nextInt();

        } while (ch == 1);
    }
}
