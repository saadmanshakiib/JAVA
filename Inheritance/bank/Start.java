import java.util.Scanner;
public class Start {
    public static void main(String[] sadman){
        BankAccount account = new BankAccount();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name : ");
        String n = input.nextLine();
        System.out.println("Enter the balance : ");
        int b = input.nextInt();
        account.setaccountholdername(n);
        account.setbalance(b);
        account.print();
        System.out.println("Enter the amount you want to deposit : ");
        int a = input.nextInt();
        account.deposit(a);
        System.out.println("Enter the money amount you want to withdraw : ");
        int w = input.nextInt();
        account.withdraw(w);
            System.out.println("After withdrawing new balance is : "+account.getbalance());
        System.out.println("Account Details : ");
        account.print();

        savingsaccount acc = new savingsaccount();
        System.out.println("Enter the name : ");
        String n1 = input.nextLine();
        System.out.println("Enter the balance : ");
        int b1 = input.nextInt();
        acc.setaccountholdername(n1);
        acc.setbalance(b1);
        acc.print();
        System.out.println("Enter the amount you want to deposit : ");
        int a1 = input.nextInt();
        acc.deposit(a1);
        System.out.println("Enter the money amount you want to withdraw : ");
        int w1 = input.nextInt();
        acc.withdraw(w1);
        System.out.println("After withdrawing new balance is : "+account.getbalance());
        System.out.println("Account Details : ");
        acc.print();




    }
}
