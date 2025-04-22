import java.util.Locale; 
import java.util.Scanner; 

public class Main { 

    public static void main(String[] args) { 

        Locale.setDefault(Locale.US); 
        Scanner sc = new Scanner(System.in); 
        Account account;
       
        System.out.print("Enter account number: ");
        int numberAccount = sc.nextInt();
        System.out.print("Enter account holder: ");    
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);
        if (response == 'y') { 
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(numberAccount, name, initialDeposit);
            System.out.println();
            
        }
        else {
            account = new Account(numberAccount, name);
        }
            
        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        account.withDraw(withdraw);
        System.out.println("Updated account data: ");
        System.out.println(account);

        sc.close();
    } 
}
