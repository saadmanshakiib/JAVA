package onetomany;

public class Student {
    private String Studentname;
    private String StudentDepartment;
    private int Studentid;

    private University uni; // association 
    Student(){}
    Student(String Studentname,String StudentDepartment,int Studentid, University uni){
        this.Studentname = Studentname;
        this.StudentDepartment = StudentDepartment;
        this.Studentid = Studentid;
        this.uni = uni;
    }
    public void setStudentname(String Studentname){
        this.Studentname = Studentname;
    }
    public void setStudentDepartment(String StudentDepartment){
        this.StudentDepartment = StudentDepartment;
    }
    public void setStudentid(int Studentid){
        this.Studentid = Studentid;
    }


    public String getStudentname(){
        return this.Studentname;
    }
    public String getStudentDepartment(){
        return this.StudentDepartment;
    }
    public int getStudentid(){
        return this.Studentid;
    }
    public void print(){
            System.out.println("Student Name : "+getStudentname());
            System.out.println("Student Department : "+getStudentDepartment());
            System.out.println("Student id : "+this.Studentid);
            uni.print();

    }

}
