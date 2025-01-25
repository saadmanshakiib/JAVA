import java.lang.*;
public class Start 
{ 
    public static void main(String[] args)
	{
      Passport pp1 = new Passport ();
      Passport pp2 = new Passport ();
      Passport pp3 = new Passport ( "Japan", "25634",48);
      Passport pp4 = new Passport ("Nepal","569874",64) ;
      Passport pp5 = new Passport ("Bangladesh","1235789",46) ;
      pp1.setCountry("China");
      pp1.setPassportno("4569587");
      pp1.setPages(42);

      pp2.setCountry("Qatar");
	  pp2.setPassportno("456932");
	  pp2.setPages(54);
      
	  
	  Person per = new Person("Sara",43,5);
       per.addPassport(pp1);
       per.addPassport(pp2);
       per.addPassport(pp3);
       per.addPassport(pp4);
       per.addPassport(pp5);
       per.showPassports();
       per.deletePassport(pp3) ;
       per.showPassports();
	}
	
}
