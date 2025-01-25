import java.util.Scanner;
public class strarray{
    public static void main(String[] args){
       try(Scanner input = new Scanner(System.in)){;
        System.out.println("Welcome");
        System.out.println("Enter the size of the array : ");
        int size = input.nextInt();
        String[] name = new String[size];
        System.out.println("Enter the names : ");
        for(int i=0;i<size;i++){
            name[i] = input.nextLine();
        }
        System.out.println("Names : ");
        for(String i : name){
            System.out.println(" "+i.toUpperCase());
        }
        
    }
}
}