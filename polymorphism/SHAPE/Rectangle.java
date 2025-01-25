package SHAPE;

public class Rectangle extends shape {
        private double height;
        private double width;
        Rectangle(){}
        Rectangle(double height,double width){
           this.height = height;
            this.width = width;
        }
        public void setlength(double height){
            this.height = height;
        }
        public void setwidth(double width){
            this.width =  width;
        }
        
        @Override
        public double Area(){
            return height*width;
        }
}
