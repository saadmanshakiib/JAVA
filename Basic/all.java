import java.util.Scanner;
public class all {
    String name;
    int salary;
    void set(String n,int s){
        name = n;
        salary = s;
        
    }
    void print(){
        System.out.println("Name : "+name+" Salary : "+salary);
    }
    public static void main(String[] args){
        all employe = new all();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the employee : ");
        employe.name = input.nextLine();
        System.out.println("Enter the salary of the employee : ");
        employe.salary = input.nextInt();
        employe.set(employe.name,employe.salary);
        employe.print();

    }
}
