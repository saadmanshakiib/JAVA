import java.util.Scanner;
public class input {
    public static void main(String[] args){
        System.out.println("Welcome");
        Scanner iinput = new Scanner(System.in) ;
            System.out.println("Enter any number : ");
            int number;
            number = iinput.nextInt();
            System.out.println("Your entered number is : "+number);
        
    
        String name;
            Scanner stringinput = new Scanner(System.in);
        System.out.println("Enter the name : ");
        name = stringinput.next();
                System.out.println("Entered name is : "+name);

}
}
