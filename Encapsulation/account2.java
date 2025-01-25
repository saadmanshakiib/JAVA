import java.util.Scanner;
public class account2{
        private String name;
        private int id;
        private String deptname;
        public void setname(String name){
            this.name = name;
        }
        public void setid(int id){
            this.id = id;
        }
        public void setdeptname(String deptname){
            this.deptname = deptname;
        }
        public String getname(){
            return this.name;
        }
        public String getdeptname(){
            return this.deptname;
        }
        public int  getid(){
            return this.id;
        }
        public void showdetails(){
            System.out.println("Student Name : "+this.name);
            System.out.println("Student ID : "+this.id);
            System.out.println("Student Department : "+this.deptname);
        }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
            System.out.println("Enter the name of the student : ");
            String n = input.nextLine();
            System.out.println("Enter the id : ");
            int I = input.nextInt();
            System.out.println("Enter the department name : ");
            String d = input.nextLine();
            account2 account = new account2();
            account.setname(n);
            account.setid(I);
            account.setdeptname(d);
            account.showdetails();
        }
    }


