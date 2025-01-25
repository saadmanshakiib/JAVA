public class Player{
    private String name;
    private String stadium;

    public void setname(String name){
        this.name = name;
    }
    public void setstadium(String stadium){
         this.stadium = stadium;
    }
    public String getname(){
        return this.name;
    }
    public String getstadium(){
        return this.stadium;
    }
    public void showdetails(){
        System.out.println("Name : "+getname());
        System.out.println("Stadium : "+getstadium());
    }
    public static void main(String[] sex){
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        Player p4 = new Player();
        Player p5 = new Player();
        p1.setname("sadman");
        p1.setstadium("sndsvk");
        p2.setname("saadman");
        p2.setstadium("sefhbds");
        p3.setname("shadman");
        p3.setstadium("sefdsihfx");
        p4.setname("shaadman");
        p4.setstadium("sedfjdbsx");
        p5.setname("sadmaan");
        p5.setstadium("sedfnhdfjdsk");


        Player[] arr = new Player[5];
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        arr[3] = p4;
        arr[4] = p5;
        for(int i=0;i<5;i++){
            System.out.println();
            arr[i].showdetails();
        }
        

    }
}