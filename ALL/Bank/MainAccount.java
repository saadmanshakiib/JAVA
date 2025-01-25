package Bank;

public class MainAccount {
        private long  balance;
        MainAccount(){}
        MainAccount(long balance){
            this.balance = balance;
        }
        public void setBalance(long balance){
            this.balance = balance;
        }
        public long getBalance(){
            return this.balance;
        }
        public void depositMoney(long amount){
            balance = balance+amount;
        }
        public void withdrawMoney(long amount){
            if(amount < balance){
                balance = balance-amount;
                System.out.println("New Balance : "+balance);
            }
            else{
                System.out.println("Insufficiant Balance");
            }
        }
        public void printmainAccount(){
            System.out.println("Main Account Balance : "+balance);
        }
}
