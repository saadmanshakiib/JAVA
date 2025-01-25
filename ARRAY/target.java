import java.util.Scanner;
import java.util.Arrays;
public class target {
    public static void main(String[] args){
        System.out.println("Welcome");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int size = input.nextInt();
        int[] array = new int[size];
                System.out.println("Enter the array elements : ");
        for(int i=0;i<size;i++){
            array[i] = input.nextInt();
        }
        Arrays.sort(array);
               System.out.println("Array elements in ascending order : ");
        for(int i=0;i<size;i++){
            System.out.print(" "+array[i]);
        }
        int c=0;
        System.out.println("\nEnter the target : ");
        int target = input.nextInt();
        for(int i=0;i<size;i++){
            if(array[i] == target){
                System.out.println("Target found at : "+(i+1)+"th position");
            }
            if(array[i]!=target){
                c++;
            }
        }
        if(c>=size){
            System.out.println("Target not found ");
        }
    }
}
