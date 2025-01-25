package labtask;

public class Person {
    private String name;
    private int age;
    private Passport pp;

    Person(){}
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setPassport(Passport pp){
        this.pp = pp;
    }
    public String getName(){return this.name;}
    public int getAge(){return this.age;}
    public Passport getPassport(){return this.pp;}

    public void showAllInfo(){
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
        pp.showPassportInfo();
    }
}
