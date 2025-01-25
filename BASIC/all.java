import java.util.Scanner;
public class all {
    static int SUM(int a,int b){
        return a+b;
    }
    static int MUL(int a,int b){
        return a*b;
    }
    public static void main(String[] args){
        System.out.println("\nWelcome");
    try (Scanner input = new Scanner(System.in)) {
        String name;
        System.out.println("Enter your name : ");
        name = input.nextLine();
        System.out.println("Hello "+name);
        System.out.println("Enter your 2nd name : ");
            String name2;
            name2 = input.nextLine();
            System.out.println("Welcome "+(name+name2).toUpperCase());
            System.out.println("Length of the first name : "+name.length());
            System.out.println("Length of the 2nd name : "+name2.length());
        System.out.println("\nEnter 2 numbers : ");
        int num1,num2;
        num1 = input.nextInt();
        num2 = input.nextInt();
            int sum = num1+num2;
            System.out.println("Sum of that 2 numbers : "+sum);
            System.out.println("\nEnter 2 numbers : ");
            int num3,num4;
            num3 = input.nextInt();
            num4 = input.nextInt();
            int mul = num3*num4;
            System.out.println("Multiplication of that 2 numbers : "+mul);
            System.out.println("Among num1 & num2 bigger is : "+Math.max(num1,num2));
            System.out.println("Among num1 & num2 smaller is : "+Math.min(num1,num2));
            System.out.println("Among num3 & num4 bigger is : "+Math.max(num3,num4));
            System.out.println("Among num3 & num4 smaller is : "+Math.min(num3,num4));
            System.out.println("Sum using fucntion is = "+SUM(num1,num2));
            System.out.println("Multiplication using fucntion is : "+MUL(num3,num4));
            int[] array = new int[5];
            System.out.println("Enter the values for array : ");
            for(int i=0;i<5;i++){
                array[i] = input.nextInt();
            }
            System.out.println("Values of the arrays : \n");
            for(int i=0;i<5;i++){
                System.out.println(" Array ["+(i+1)+"] = "+array[i]);
            }
            System.out.println("Using For each loop : \n");
            for(int i : array){
                System.out.print(" "+i);
            }
            

    }

}
}
