import java.util.Scanner;
public class Account{
    private String name;
    private int id;
    public void setname(String name){
        this.name = name;
    }
    public void setid(int id){
        this.id = id;
    }
    public String getname(){
        return this.name;
    }
    public int getid(){
        return this.id;
    }
    public void showdetails(){
        System.out.println("Account name : "+this.name);
        System.out.println("Account id : "+this.id);
    }
    public static void main(String[] args){
        Account account = new Account();
        account.setname("Saadman");
        account.setid(53467);
        account.showdetails();
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the name : ");
            String name2 = input.nextLine();
            System.out.println("Enter the id : ");
            int id2 = input.nextInt();
            Account account2 = new Account();
            account2.setname(name2);
            account2.setid(id2);
            account2.showdetails();
        }
    }
}