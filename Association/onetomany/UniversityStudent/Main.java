
public class Main {
        public static void main(String[] arsg){
            Student s = new Student();
            s.setStudentname("Sadman Al Sakib");
            s.setStudentDepartment("CSE");
            s.setStudentid(53467);
            
            University u = new University();
            u.setCode(8695);
            u.setName("AIUB");

            s.print();

            
            Student s2 = new Student();
            s2.setStudentname("Sakib");
            s2.setStudentDepartment("EEE");
            s2.setStudentid(54432);
            s2.print();
                }
}
