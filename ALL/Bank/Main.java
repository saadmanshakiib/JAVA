package Bank;

public class Main {
    public static void main(String[] args){
        Person p = new Person();
        p.setName("Saadman");
        p.setAge(23);
        p.setBirthdate("10-12-2002");
        p.setEmail("saadman102002@gmail.com");
        p.setPhonenumber("01615828990");
        p.print();
        System.out.println();

        MainAccount m = new MainAccount();
        m.setBalance(170000);
        m.depositMoney(55000);
        m.withdrawMoney(45000);

        SavingsAccount s = new SavingsAccount();
        s.setSavingAmount(50000);

        p.setMainaccount(m);
        m.printmainAccount();
        System.out.println();

        p.setSavingsamount(s);
        s.printsaving();
    }
}
