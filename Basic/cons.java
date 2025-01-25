public class cons {
    String name;
    int salary;
    int id;
    String field;
     void print(){
       System.out.println("Name : "+name+"\nID : "+id+"\nSalary : "+salary+"\nField : "+field);
   }
    cons(String n,int s,int i,String f){
    name=n;
    salary=s;
    id=i; 
    field=f;
   }
    public static void main(String[] args){
        cons employee = new cons("Sadman",121000,53467,"Software");
        cons employee2 = new cons("Sadat",121000,53557,"Software");
        cons employee3 = new cons("Joabyer",99000,21467,"Software");
        employee.print();
        employee2.print();
        employee3.print();
    }
}
    

