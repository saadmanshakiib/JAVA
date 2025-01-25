package OVERRDING;

public class Airplane {
    private String model;
    private int price;
    
    Airplane(){}
    public void setModel(String model){
        this.model = model;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public String getModel(){
        return this.model;
    }
    public int getPrice(){
        return this.price;
    }

    public void display(){
        System.out.println("Model : "+getModel());
        System.out.println("Price : "+getPrice());
    }
}
