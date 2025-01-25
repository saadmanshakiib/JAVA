public class Static {
    private String name;
    private int id;
    static String universityname = "AIUB";
    static{
        System.out.println(" static block 1");
    }
    Static(){
        System.out.println("Default constructor");
    }
    Static(String name,int id){
        this.name = name;
        this.id = id;
    }
    public void setname(String name){
        this.name = name;
    }
    public void setid(int id){
        this.id = id;
    }
    public String getname(){
        return name;
    }
    public int id(){
        return this.id;
    }
    public void showdetails(){
        System.out.println("Name : "+this.name);
        System.out.println("ID : "+this.id);
        System.out.println("University  : "+universityname);
    }
    public static void main(String[] srdsbnmsaf){
        System.out.println("Main function");
        Static s = new Static();
        s.setname("Saadman");
        s.setid(35261);
        Static s1 = new Static("Sakib",53467);
        s.showdetails();
        s1.showdetails();
    }
    static{
        System.out.println("Static block 2");
    }
}
