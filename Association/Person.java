import java.lang.*;
public class Person
{
	private String name;
	private int age;
	private Passport pp[];
	public Person(){}
	
	public Person(String name,int age,int size) {
	 this.name=name; 
	 this.age=age;
	 this.pp= new Passport[size];
	}
	public void setName(String name) {
	  this.name=name; }
	public void setAge(int age) {
	  this.age=age; }
	public String getName() {
	 return this.name; }
	public int getAge() {
	 return this.age;  }
	
	public void addPassport(Passport P) {
		boolean check = false;
		for(int i=0; i<pp.length; i++) {
			if(pp[i]==null) {
			pp[i]=P;  }
		check = true ; }
	if(check==true) {
		System.out.println("Passport Added");
	}
	else{
		System.out.println("Error");
	}
	}
	
	public void deletePassport(Passport P)
	{ 
	boolean check = false;
		for(int i=0; i<pp.length; i++) {
			if(pp[i]==P) {
			pp[i]=null;  
		check = true ; }
	if(check==true) {
		System.out.println("Passport Deleted");
	}
	else{
		System.out.println("Error");
	}
	}
	}
	public void showPassports()
	{
		for(int i=0; i<pp.length; i++) {
			if(pp[i]!=null){
				System.out.println("Passport No.: "+(i+1));
				pp[i].showPassportInfo();
			}
		}
	}
	
	
}		
	 
	
