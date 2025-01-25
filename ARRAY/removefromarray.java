import java.util.Scanner;
public class removefromarray{
    public static void main(String[] sadman){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = input.nextInt();
        int array[] = new int[size];
        int index;
        for(index=0;index<size;index++){
            System.out.print("\nEnter the element no : "+(index+1)+" ");
            array[index] = input.nextInt();
        }
        System.out.print("\nArray Elements : ");
        for(index=0;index<size;index++){
            System.out.print(array[index]+" ");
        }
            System.out.print("\nEnter the position you want to delete : ");
                int position = input.nextInt();
                System.out.println("position is : "+position);
               if(position<size){
                    for(index=(position-1);index<(size-1);index++){
                        array[index] = array[index+1];
                    }
                                            array[size-1] = 0;
               }
                else{
                    System.out.println("Error");
                }
                System.out.print("\nArray Elements after deleting : ");
                for(index=0;index<size;index++){
                    System.out.print(array[index]+" ");
                }
            }
}
