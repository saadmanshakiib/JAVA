package SHAPE;

public class shape {
        shape(){}
        private double height;
        private double width;
        shape(double height,double width){
            this.height = height;
            this.width = width;
        }
        public void setheight(double height){
            this.height = height;
        }
        public void setwidth(double width){
            this.width = width;
        }
    public double Area(){
        return height*width;
    }
}
