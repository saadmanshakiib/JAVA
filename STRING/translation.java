
import java.util.Scanner;
import java.lang.String;
public class translation{
    public static void main(String[] args){
        String a,x;
        try(Scanner input = new Scanner(System.in)){
            a = input.nextLine();
            x = input.nextLine();
            StringBuilder b = new StringBuilder(a);
           String c =  b.reverse().toString();
            if(x.equals(c)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

    }
}