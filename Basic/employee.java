import java.util.Scanner;
public class employee {
    String name;
    int salary;
    void set(String n,int s){
        name = n;
        salary =s;
    }
    void print(){
                System.out.println("Name of the employee : "+name);
                System.out.println("Salary of the employee : "+salary);

    }
    public static void main(String[] args){
        System.out.println("Welcome");
        Scanner input = new Scanner(System.in);
        employee e1 = new employee();
                System.out.println("Enter the name of the employee : ");
                e1.name = input.nextLine();
                System.out.println("Enter the salary of the employee : ");
                e1.salary = input.nextInt(); 
                e1.set(e1.name,e1.salary);
                e1.print();  
             

    }
}
