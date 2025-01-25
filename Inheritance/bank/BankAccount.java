package bank;

public class BankAccount {
    private int balance;
    private String accountholdername;

    public void setbalance(int balance){
        this.balance = balance;
    }
    public void setaccountholdername(String accountholdername){
        this.accountholdername = accountholdername;
    }
    public void depositmoney(int deposit){
            balance = balance+deposit;
    }
    public void withdraw(int withdraw){
        this.balance = this.balance-withdraw;
    }

    public int getbalance(){
        return this.balance;
    }
    public String getname(){
        return this.accountholdername;
    }
    
    public void print(){
        System.out.println("Account Holder Name : "+this.accountholdername);
        System.out.println("Balance : "+this.balance);
    }
}
