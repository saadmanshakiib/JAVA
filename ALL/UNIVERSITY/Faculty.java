public class Faculty{
    private String name;
    private int salary;
    private String dept;

    Faculty(){}
    Faculty(String name,int salary,String dept){
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public void setDept(String dept){
        this.dept = dept;
    }

    public String getName(){
        return this.name;
    }
    public int getSalary(){
        return this.salary;
    }
    public String getDept(){
        return this.dept;
    }

    public void print(){
        System.out.println("Name : "+this.name);
        System.out.println("Department : "+this.dept);
        System.out.println("Salary : "+this.salary);
        System.out.println();
    }
}