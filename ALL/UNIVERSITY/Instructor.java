public class Instructor extends Faculty{
    private String instructorID;
    private FacultyAccount IFA;
    Instructor(){}
    Instructor(String name,int salary,String dept,String instructorID){
        super(name,salary,dept);
        this.instructorID = instructorID;
    }

    public void setIFA(FacultyAccount IFA){
        this.IFA = IFA;
    }
    public FacultyAccount getIFA(){
        return this.IFA;
    }

    public void setInstructorID(String instructorID){
        this.instructorID = instructorID;
    }
    public String getInstructorID(){
        return this.instructorID;
    }
    @Override
    public void print(){
        super.print();
        System.out.println("Instructor ID : "+this.instructorID);
        System.out.println();
    }

}