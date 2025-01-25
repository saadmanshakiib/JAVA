public class class_function {
    static void myfunction(){
        System.out.println("\nFunction has been called ");
    }
    static void loop(){
        System.out.println("\nLoop function has been called\n");
        String name[] = {"Sadman","Sakib","Nissan"};
        for(String j : name){
            System.out.println(j);
        }
    }
    public static void main(String[] args){
        System.out.println("\nWelcome");
        myfunction();
        loop();
    }
}
