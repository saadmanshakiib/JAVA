package SHAPE;
public class Triangle extends shape{
    private double base;
    private double height;
    Triangle(){}
    Triangle(double base,double height){
        this.base = base;
        this.height = height;
    }
    public void setbase(double base){
        this.base = base;
    }
    public void setheight(double height){
        this.height = height;
    }
    @Override
    public double Area(){
        return 0.5*base*height;
    }
}