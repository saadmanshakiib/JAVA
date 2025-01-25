import java.util.Scanner;
public class oop1 {
    String name;
    int id;
    double cgpa;
    oop1(String n,int i,double c){
        name = n;
        id = i;
        cgpa = c;
    }
    public void print(){
        System.out.println("Name : "+name+" ID : "+id+" CGPA : "+cgpa);
    }
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){
        System.out.println("Enter the name of the stduent : ");
        String name1 = input.nextLine();
        System.out.println("Enter the id of the student  : ");
        int id1 = input.nextInt();
        System.out.println("Enter the CGPA of the student : ");
        double cgpa1 = input.nextDouble();
        oop1 student = new oop1(name1,id1,cgpa1);
        student.print();
        }
        
    }
}
