package LabTAsk2;

public class Main {
    public static void main(String[] args){
        Passport p1 = new Passport();
        Passport p2 = new Passport();
        Passport p3 = new Passport("Russia","4361278953463",40);
        Passport p4 = new Passport("India","64378311131244",44);
        Passport p5 = new Passport("Pakistan","41278913145",32);
         
        p1.setCountry("Bangladesh");
        p1.setPassportno("2143254671");
        p1.setPages(44);

        p2.setCountry("England");
        p2.setPages(444);
        p2.setPassportno("54623789320");

        Person per = new Person("Sakib",23,4);
        per.AddPassport(p1);
        per.AddPassport(p2);
        per.AddPassport(p3);
        per.AddPassport(p4);
        per.AddPassport(p5);

        per.showallpassports();
        per.DeletePassport(p3);
        per.showallpassports();
        
    

    }
}
