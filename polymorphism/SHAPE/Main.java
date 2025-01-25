package SHAPE;
import java.util.Scanner;
public class Main  {
    public static void main(String[] arsb){
        double lr;
        try(Scanner in = new Scanner(System.in)){
            Rectangle r = new Rectangle();
            System.out.println("Enter the length of the rectangle : ");
            try{
            lr = in.nextDouble();
            r.setlength(lr);
            }
            catch(ArithmeticException e){
                System.out.println("Something went wrong");
            }
            System.out.println("Enter the width of the rectangle : ");
            try{
            double wr = in.nextDouble();
            r.setlength(wr);
            }
            catch(ArithmeticException e){
                System.out.println("Error");
            }
            System.out.println("Area of the Rectangle : "+r.Area());


                Triangle t =  new Triangle();
                System.out.println("Enter the base of the triangle : ");
                double bt,ht;
                try{
                    bt = in.nextDouble();
                    t.setbase(bt);
                    ht = in.nextDouble();
                    t.setheight(ht);
                }
                catch(NullPointerException ne){
                    System.out.println("Value cant be zero");
                }
                catch(ArithmeticException ae){
                    System.out.println("Error!");
                }
                System.out.println("Area of the Triangle : "+t.Area());


                Circle c = new Circle();
                System.out.println("Enter the radius : ");
                double cr;
                try{
                    cr = in.nextDouble();
                    c.setradius(cr);
                }
                catch(NullPointerException nc){
                    System.out.println("Value cant be zero");
                }
                catch(ArithmeticException ac){
                    System.out.println("Error");
                }
                System.out.println("Area of the Circle : "+c.Area());
        }
    }
    
}
