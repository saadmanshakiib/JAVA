import java.lang.*;
public class Passport 
{
	private String country;
    private String passportno;
    private int pages;

 public Passport () {}
 public Passport (String country,String passportno,int pages) {

   this.country = country;
   this.passportno = passportno;
   this.pages = pages; 
}
public void setCountry(String country) {
   this.country = country; 
}
public void setPassportno(String passportno) {
   this.passportno = passportno;  
}
public void setPages(int pages) {
   this.pages = pages;
 }
public String getCountry() {
   return this.country; 
}
public String getPassportno () {
   return this.passportno; 
}
public int getPages() { 
   return this.pages; 
 }

public void showPassportInfo () 
{
   System.out.println("Country : "+this.country);
   System.out.println("Passport No: "+this.passportno);
   System.out.println("Pages : "+this.pages);
}
 }