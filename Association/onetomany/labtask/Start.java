package labtask;

public class Start {
    public static void main(String[] arsgn){
        Person p = new Person();
        Person p1 = new Person("Sakib",23);
        p.setName("Saadman");
        p.setAge(22);
        Passport pp1 = new Passport();
        Passport pp2 = new Passport("950211","23-12-2026",36);
        pp1.setExpiredate("22-11-2029");
        pp1.setPassportNo("53467");
        pp1.setPages(32);
        
        p.setPassport(pp1);
        p1.setPassport(pp2);

        p.showAllInfo();
        p1.showAllInfo();
    }
}
