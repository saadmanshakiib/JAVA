package studentAddress;
import java.util.Scanner;
public class Main {
    public static void  main(String[] gfbds){
        Student s = new Student();
        StudentAddress sa = new StudentAddress();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of the student  : ");
        s.setName(in.nextLine());
        System.out.println("Enter the Department name of the student : ");
        s.setDept(in.nextLine());
        System.out.println("Enter the City name of the student : ");
        sa.setCity(in.nextLine());
        System.out.println("Enter the Zipcode of that city : ");
        sa.setZipcode(in.nextLine());
        System.out.println("Enter the ID of the student : ");
        s.setID(in.nextInt());
        s.print();
        sa.printaddress();
    }
}
