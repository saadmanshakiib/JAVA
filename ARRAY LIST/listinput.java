import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class listinput {
    public static void main(String[] args){
        System.out.println("Welcome");
        ArrayList<Integer> list1 = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the list : ");
        int Size = in.nextInt();
        System.out.println("Enter the numbers : ");
        for(int i=0;i<Size;i++){
            list1.add(in.nextInt());
        }
        System.out.print("List : ");
        System.out.print(list1);
    }
}
