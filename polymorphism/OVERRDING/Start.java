package OVERRDING;

public class Start {
    public static void main(String[] arsdsa){
        Jetplane j = new Jetplane();
        j.setModel("ASDFGH");
        j.setPrice(6700000);
        j.setMaxSpeed(567);
        j.display();
        System.out.println();
        Airplane a = new Airplane();
        a.setModel("QWERT");
        a.setPrice(5550000);
        a.display();
    }
}
