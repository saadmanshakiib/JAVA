import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
public class Main {
    public static void main(String[] sadman){
        private FacultyAccount f;
        try(Scanner in = new Scanner(System.in)){
        Instructor insrtructor1 = new Instructor("Sadman",50000,"CSE","53467");
        insrtructor1.print();
        FacultyAccount f = new FacultyAccount();
        f.setName("Ami");
        f.printaccountdetails();
        FacultyAccount ifa1 = new FacultyAccount();
        ifa1.setName("Sakib");
        ifa1.setEmail("saadman102002@gmail.com");
        ifa1.setContactno("01615828990");
        ifa1.setDOB("10-12-2002");
        ifa1.setNationality("Bangladeshi");
        insrtructor1.setIFA(ifa1);
        ifa1.printaccountdetails();
        System.out.println();

        SeniorFaculty seniorfaculty1 = new SeniorFaculty();
        seniorfaculty1.setName("Ahmed");
        seniorfaculty1.setSalary(60000);
        seniorfaculty1.setDept("EEE");
        seniorfaculty1.setSeniorFacultyID("245501");

        FacultyAccount sfa1 = new FacultyAccount();
        sfa1.setName("Ahmed Jobayer");
        sfa1.setContactno("01741942985");
        sfa1.setEmail("ahmed10@gmail.com");
        sfa1.setDOB("27-10-2002");
        sfa1.setNationality("Bangladeshi");
        System.out.println();
        seniorfaculty1.setSFA(sfa1);
        seniorfaculty1.print();
        sfa1.printaccountdetails();

        ///Student
firstyearStudent fys = new firstyearStudent("Nissan","CSE",3.73,"23-53467-3");
fys.print();
secondyearStudent sys = new secondyearStudent("Ahmed Jobayer","ARCH",3.88,"22-21233-2");
sys.print();
thirdyearstudent tys = new thirdyearstudent("Hamim","EEE",3.44,"21-29921-1");
tys.print();
forthyearstudent frys = new forthyearstudent("Arshad","IPE",3.92,"20-22211-1");
frys.print();
// student account
StudentAccount fsa =  new StudentAccount("Saaadman","nissan120438@gmail.com","01727478856","20-1-2002","Bangladeshi");
fys.setStudentacc(fsa);
fsa.printaccountdetails();
            Instructor instructor2 = new Instructor();
            File file = new File("Uni.txt");
            try{
                if(file.createNewFile()){
                    System.out.println("File Has been created");
                    FileWriter filewriter = new FileWriter("Uni.txt");
                    try{
            System.out.println("Enter the name of the instructor 2 : ");
            instructor2.setName(in.nextLine());
            System.out.println("Enter the department name : ");
            instructor2.setDept(in.nextLine());
            System.out.println("Enter the ID : ");
            instructor2.setInstructorID(in.nextLine());
            System.out.println("Enter the salary : ");
            instructor2.setSalary(in.nextInt());
            instructor2.print();
            filewriter.write(instructor2.getName());
            filewriter.write(instructor2.getDept());
            filewriter.write(instructor2.getInstructorID());
            filewriter.write(instructor2.getSalary());
                        filewriter.close();
                    }
                    catch(Exception ioe){
                        System.out.println("Error while writing");
                        ioe.printStackTrace();
                    }
                    Scanner read =  new Scanner(file);
                    while(read.hasNextLine()){
                        String data = read.nextLine();
                        System.out.println(data);
                    }
                    read.close();
                }
            }
            catch(IOException ioe2){
                System.out.println("Error while creating file");
            }

    }
}
}
