import java.util.Scanner;
public class encapsulation {
    public String name;
    private int id;
    private double cg;
    public void setidcg(int i,double c,String n){
        id = i;
        cg =c;
        name = n;
    }
    //public void setname(String n){
        //name = n;
    //}
    public void print(){
        System.out.println("ID : "+id+" CGPA : "+cg);
    }
    public static void main(String[] args){
        encapsulation student = new encapsulation();
        try(Scanner input = new Scanner(System.in)){
        System.out.println("Enter the cgpa : ");
        double cgpa = input.nextDouble();
        System.out.println("Enter the id : ");
        int id1 = input.nextInt();
        //student.setidcg(id1,cgpa,name1);
        //student.print();
        System.out.println("Enter the name : ");
        String name1 = input.nextLine();
        //student.setname(name1);
        student.setidcg(id1,cgpa,name1);
        }
    }
}
