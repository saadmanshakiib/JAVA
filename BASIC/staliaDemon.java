
public class staliaDemon { 
public static double a;
public static float b;
static{
System.out.println( "This is static block 1");
a=500;
}
static{
System.out.println("Ihis. is static block 2");
b=600;
}
staliaDemon(){
System.out.println("This is a Default constructor");
}
public static void main (String[] angst){
     staliaDemon s1 = new staliaDemon();
System.out.println(staliaDemon.a);
System.out.println(staliaDemon.b);
s1.b=300;
System.out.println(s1.b);
System.out.println(" this is static block 3");
}
}