import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
public class arraylist2 {
    public static void main(String[] args){
        ArrayList<Integer>al = new ArrayList<Integer>();
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("\nWelcome");
            System.out.println("Enter the size of the array list : ");
            int s = input.nextInt();
            System.out.println("Size of the ArrayList : "+al.size());
            for(int i=0;i<s;i++){
                int x = input.nextInt();
                al.add(x);
            }
            System.out.println("Value of the arraylist : ");
            for(int i : al){
                System.out.print(" "+i);
            }
            System.out.println("\nEnter the position and the value to add : ");
            int pos,value;
            pos = input.nextInt();
            value = input.nextInt();
            al.add(pos+1,value);
        
        System.out.println("After adding the values : ");
        for(int i : al){
            System.out.print(" "+i);
        }
        System.out.println("\nAfter sorting the values : ");
        Collections.sort(al);
        for(int i : al){
            System.out.print(" "+i);
        }
        System.out.println("\nEnter the index you want to remove  : ");
           int index = input.nextInt();
           al.remove(index-1);
           System.out.println("After removing : ");
           for(int i : al){
            System.out.print(" "+i);
        }
        System.out.println("Enter the number to check : ");
        int number = input.nextInt();
        boolean check = al.contains(number);
        System.out.println("Checking if the value is in the list : "+check);
        System.out.println("The index of that number : "+al.indexOf(number));

    }
}
}
