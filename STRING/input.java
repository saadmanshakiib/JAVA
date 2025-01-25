import java.util.Scanner;
public class input {
    public static void main(String[] args){
        System.out.println("Welcome");
        try (Scanner input = new Scanner(System.in)) {
            String name,name2;
            System.out.println("Enter your first name : ");
            name = input.nextLine();
            System.out.println("Enter your last name : ");
            name2 = input.nextLine();
            System.out.println(" Welcome : "+(name+name2));
            System.out.println("Upper Case first name : "+(name.toUpperCase()));
        System.out.println("Lower Case last name : "+(name2.toLowerCase()));
        boolean check = name.startsWith("sad");
        boolean check2 = name2.startsWith("sak");
        System.out.println("First name starts with sad : "+check);
        System.out.println("Last name starts with sak : "+check2);

        }
    }
}
