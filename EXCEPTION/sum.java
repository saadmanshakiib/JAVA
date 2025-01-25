import java.util.Scanner;
public class sum{
    public static void main(String[] daf){
       try( Scanner in =  new Scanner(System.in)){
        System.out.println("Enter a number : ");
        int n = in.nextInt();
        System.out.println("Enter another number : ");
        int m = in.nextInt();
        try{
            int r = n/m;
            System.out.println("Result : "+r);
        }
        catch(ArithmeticException e){
            System.out.println("Cant divide by zero");
        }
    }
}
}