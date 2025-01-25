import java.util.Scanner;
public class arraysub{
    public static void main(String[] args){
                                int i,j;
                                        Scanner input = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("Enter the row number of the array 1 : ");
       int row = input.nextInt();
                System.out.println("Enter the col number of the array 1");
        int col = input.nextInt();
               System.out.println("Enter the array 1 elements : \n");
                        int[][] array1 = new int[row][col];
                        for(i=0;i<row;i++){
        for(j=0;j<col;j++){
       array1[i][j] = input.nextInt();
                            }
                        }
            System.out.println("Enter the row number of the array 2 : ");
       int row2 = input.nextInt();
                System.out.println("Enter the col number of the array 2");
        int col2 = input.nextInt();
                        int[][] array2 = new int[row2][col2];
                               System.out.println("Enter the array 2 elements : \n");

for(i=0;i<row2;i++){
        for(j=0;j<col2;j++){
       array2[i][j] = input.nextInt();
                            }
                        }
                        System.out.println("Array 1 : \n");
                       for(i=0;i<row;i++){
                            for(j=0;j<col;j++){
                                System.out.print(" "+array1[i][j]);
                            }
                            System.out.print("\n");
                        }
                                                System.out.println("Array 2 : \n");
                        for(i=0;i<row2;i++){
                            for(j=0;j<col2;j++){
                                System.out.print(" "+array2[i][j]);
                            }
                            System.out.print("\n");
                        }
                        if(row==row2 && col==col2){
                            System.out.println("Substraction of the arrays : \n");
                        for(i=0;i<row;i++){
                            for(j=0;j<col;j++){
                                System.out.print(" "+(array1[i][j]-array2[i][j]));
                            }
                            System.out.print("\n");
                        }
                        }
                        else{
                            System.out.println("Substraction not possible");
                        }



    }
}