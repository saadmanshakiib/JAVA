package n;
 public class Office{
	private String dept;
	private double salary;
	
	public Office(){}
	
	public Office (String dept, double salary){
		this.dept = dept;
		this.salary = salary;
	}
	public void setDept(String dept){
		this.dept = dept;
	}
	public String getDept(){
		return dept;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
	public double getSalary(){
		return salary;
	}
	
	public void display(){
		System.out.println("Department : " + dept);
		System.out.println("Salary : " + salary);
	}
}
class Employee extends Office{
	private String name;
	private char gender;
	private int id;
	
	public Employee(){}
	
	public Employee(String dept, double salary, String name, char gender, int id){
		super(dept,salary);
		this.name = name;
		this.gender = gender;
		this.id = id;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setGender(char gender){
		this.gender = gender;
	}
	public char getGender(){
		return gender;
	}
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}
	
	public void display(){
        super.display();
		System.out.println("Name : " + name); 
		System.out.println("Gender : " + gender); 
		System.out.println("ID : " + id); 
	}
}