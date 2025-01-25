package SHAPE;

public class Circle extends shape{
    private double radius;
    Circle(){}
    Circle(double radius){
        this.radius = radius;
    }
    public void setradius(double radius){
        this.radius = radius;
    }
    @Override
    public double Area(){
           return 3.1416*radius*radius; 
    }
}
