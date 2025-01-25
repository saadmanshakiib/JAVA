public class staticvariable {
    static int a = 30;
    static int b = 35;
    static{
        System.out.println("Static block 1");
        a = a+100;//130
    }
    static{
        System.out.println("Static block 2");
        a = a+ b+100;//135
    }
    static{
        System.out.println("Static block 3");
        a = a*2;//270
    }
   
    static{
        System.out.println("Static block 4");
        b = b*2;//70
    }
    void setstatic(){
        a = 90;
    }
    staticvariable(){
        a = 99;
    }
    public static void main(String[] ardtsabdsa){
        System.out.println("Main Function");
        staticvariable s = new staticvariable();
        System.out.println("Value of a : "+a);
        System.out.println("Value of b : "+b);
        staticvariable.a = 450;
        staticvariable.b = 230;
        s.setstatic();
        System.out.println("Value of a : "+a);
        System.out.println("Value of b : "+b);
    }
}
