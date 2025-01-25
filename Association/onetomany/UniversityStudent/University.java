package onetomany;
public class University{
    private int code;
    private String name;
    University(){}
    University(int code,String name){
        this.code = code;
        this.name = name;
    }
  
    public void setCode(int code){
        this.code = code;
    }
    public void setName(String name){
        this.name = name;
    }

   
    public int getCode(){
        return this.code;
    }
    public String getName(){
        return this.name;
    }
    public void print(){
        System.out.println("\nUniversity Name : "+this.name);
        System.out.println("University Code : "+this.code);
    }
}