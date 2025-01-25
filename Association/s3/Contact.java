package OOP.Association.s3;

public class Contact {
    Contact(){}
    Contact(String name,String number){
        this.name=name;
        this.number=number;
    }
    private String name;
    private String number;

    public void setName(String name){this.name=name;}
    public void setNumber(String number){this.number=number;}

    public String getName(){return this.name;}
    public String getNumber(){return this.number;}

    public void showContactDetails(){
        System.out.println("Name : "+this.name);
        System.out.println("Number : "+this.number);
    }

}
