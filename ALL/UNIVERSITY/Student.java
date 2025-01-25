public class Student {
    private String name;
    private String dept;
    private double cg;
    Student(){}
    Student(String name,String dept,double cg){
        this.name = name;
        this.dept = dept;
        this.cg = cg;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDept(String dept){
        this.dept = dept;
    }
    public void setCG(double cg){
        this.cg = cg;
    }
    public String getName(){return this.name;}
    public String getDept(){return this.dept;}
    public double getCG(){return this.cg;}
    public void print(){
        System.out.println("Student Details : ");
        System.out.println("Name : "+this.name);
        System.out.println("Department : "+this.dept);
        System.out.println("CGPA : "+this.cg);
    }
}
