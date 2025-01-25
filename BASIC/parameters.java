public class parameters {
    static void fun(String s){
        System.out.println("\nFunction has been called \n");
        System.out.println("Hello "+s);
    }
    static void sum(int a,int b){
        System.out.println("\nSum of the 2 numbers is : "+(a+b));
    }
    static void mul(int a, int b){
        System.out.println("\nMultiplication of that 2 numbers is : "+(a*b));
    }
    static void string(String a,String b){
        System.out.println("\nAdding two strings : "+(a+b));
    }
    public static void main(String[] args){
        System.out.println("\nWelcome");
        fun("Sadman");
        sum(34,56);
        mul(3,4);
        string("3","4");
    }
}
