package OVERRDING;

 class Jetplane extends Airplane {
        private int maxspeed;
        public void setMaxSpeed(int maxspeed){
            this.maxspeed = maxspeed;
        }
        public int getMaxSpeed(){
            return this.maxspeed;
        }
        @Override
        public void display(){
            System.out.println("Model : "+getModel());
            System.out.println("Price : "+getPrice());
            System.out.println("Max Speed : "+getMaxSpeed());
        }
}
