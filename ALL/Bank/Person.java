package Bank;
public class Person{
    private String name;
    private String email;
    private String phonenumber;
    private String birthdate;
    private int age;
    private SavingsAccount sa;
    private MainAccount ma;
    Person(){}
    Person(String name,String email,String phonenumber,String birthdate,int age){
        this.name = name;
        this.email = email;
        this.phonenumber = phonenumber;
        this.birthdate = birthdate;
        this.age = age;
    }
    public void setSavingsamount(SavingsAccount sa){
        this.sa = sa;
    }
    public void setMainaccount(MainAccount ma){
        this.ma = ma;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhonenumber(String phonenumber){
        this.phonenumber = phonenumber;
    }
    public void setBirthdate(String birthdate){
        this.birthdate = birthdate;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public String getphonenumber(){
        return this.phonenumber;
    }
    public String getEmail(){
        return this.email;
    }
    public String getBirthdate(){
        return this.birthdate;
    }
    public void print(){
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
        System.out.println("Phone Number : "+this.phonenumber);
        System.out.println("Email : "+this.email);
        System.out.println("Birthdate : "+this.birthdate);
    }
}