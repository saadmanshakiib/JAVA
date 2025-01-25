package Bank;

public class SavingsAccount extends MainAccount{
        private long savingamount;
        SavingsAccount(){}
        SavingsAccount(long savingamount){
            this.savingamount = savingamount;
        }
        public void setSavingAmount(long savingamount){
            this.savingamount = savingamount;
        }
        public long getSavingAmount(){
            return this.savingamount;
        }
        public void printsaving(){
            super.printmainAccount();
            System.out.println("Saved Money : "+savingamount);
        }
}
