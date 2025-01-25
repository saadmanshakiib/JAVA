public class cls{
    int accountnumber;
    String accountholdername;
    double balance;
    public void setaccountnumber(int n){
        accountnumber = n;
    }
    public void setaccountholdername(String nm){
        accountholdername = nm;
    }
    public void setbalance(double b){
        balance=b;
    }
    public void print(){
        System.out.println("Name : "+accountholdername);
                System.out.println("Account Number : "+accountnumber);
        System.out.println("Balance : "+balance);

    }
    public void main(String[] args){
        setaccountnumber(950211);
        setaccountholdername("Saadman");
        setbalance(120000);
        print();
    }
}