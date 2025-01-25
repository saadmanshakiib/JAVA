package studentAddress;
public class Student{
    private String name;
    private int id;
    private String dept;
    private StudentAddress address;

    Student(){}
    Student(String name,int id,String dept){
        this.name = name;
        this.id = id;
        this.dept = dept;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setID(int id){
        this.id = id;
    }
    public void setDept(String dept){
        this.dept = dept;
    }
    public void setAdress(StudentAddress address){
        this.address = address;
    }

    public String getName(){return this.name;}
    public String getDept(){return this.dept;}
    public int getID(){return this.id;}

    public void print(){
        System.out.println("Name : "+this.name.toUpperCase());
        System.out.println("ID : "+this.id);
        System.out.println("Department Name : "+this.dept.toUpperCase());
        address.show();
    }

}