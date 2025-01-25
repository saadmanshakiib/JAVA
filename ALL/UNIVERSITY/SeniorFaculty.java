public class SeniorFaculty extends Faculty{
    private String SeniorFacultyID;
    private FacultyAccount SFA;
    SeniorFaculty(){}
    SeniorFaculty(String name,int salary,String dept,String SeniorFacultyID){
        super(name,salary,dept);
        this.SeniorFacultyID = SeniorFacultyID;
    }

    public void setSFA(FacultyAccount SFA){
        this.SFA = SFA;
    }
    public FacultyAccount getSFA(){
        return this.SFA;
    }
    
    public void setSeniorFacultyID(String SeniorFacultyID){
        this.SeniorFacultyID = SeniorFacultyID;
    }
    public String getSeniorFacultyID(){
        return this.SeniorFacultyID;
    }
    @Override
    public void print(){
        super.print();
        System.out.println("Senior Faculty ID : "+this.SeniorFacultyID);
        System.out.println();
    }
}
