import  java.util.Scanner;
import  java.util.Arrays;
public class array {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<5;i++){
        array[i] = input.nextInt();
        }
        Arrays.sort(array);
        for(int i=0;i<array.length;i++){
        System.out.println("Array elements : "+array[i]);
        }
        System.out.println("Size of the array : "+array.length);
        int value;
        int c=0;
        System.out.print("Enter the target : ");
        value = input.nextInt();
        for(int i=0;i<5;i++){
            if(array[i]==value){
                System.out.println("Value found at "+(i+1)+" position");
            }
            else if(array[i]!=value){
                c++;
            }
        }
        if(c>4){
            System.out.println("Not Found");
        }
    }
}
