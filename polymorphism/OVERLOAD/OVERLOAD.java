package OVERLOAD;

public class OVERLOAD{
    public int sum(int a,int b){
        return a+b;
    }
    public int sum(int a,int b,int c){
        return a+b+c;
    }
    public int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }
    public static void main(String[] sadman){
        OVERLOAD o = new OVERLOAD();
System.out.println("Welcome");
System.out.println("Sum of two : "+ o.sum(67,90));
System.out.println("Sum of three : "+ o.sum(67,90,77));
System.out.println("Sum of four : "+ o.sum(67,90,12,11));

    }
}