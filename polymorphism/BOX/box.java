package polymorphism;
public class box {
    private int height;
    private int width;
    private int length;
    box(){
        System.out.println("Default constructor");
    }
    box(int height,int width,int length){
        this.height = height;
        this.width = width;
        this.length = length;
    }
    public void setvalue(int height,int width){
        this.height = height;
        this.width = width;
    }
    public void setvalue(int height,int width,int length){
        this.height = height;
        this.width = width;
        this.length = length;
    }
    public int getarea(){
        return (this.height*this.width);
    }
    public int getarea2(){
        return (this.height*this.width*this.length);
    }
    public static void main(String[] sadman){
        box b1 = new box(45,2,2);
        System.out.println("B1 Area : "+b1.getarea2());
        box b2 = new box();
        b2.setvalue(30,2);
        System.out.println("B2 Area : "+b2.getarea());
        box b3 = new box();
        b3.setvalue(20,2,10);
        System.out.println("B3 Area : "+b3.getarea2());
    }

}
