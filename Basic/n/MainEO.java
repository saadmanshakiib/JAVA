package n;

public class MainEO{
	public static void main(String[] args){
		Employee N1 = new Employee("CSE", 123.45, "Utsha", 'M', 12345);
		Employee N2 = new Employee("EEE", 543.21, "Tushar", 'M', 54321);
		
		N1.display();
		System.out.println();
		N2.display();
		System.out.println();
	}
}
