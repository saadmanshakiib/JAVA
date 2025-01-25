import java.util.*;
public class abstractlistdemo {
    public static void main(String[] args) {
        try{
            AbstractList<String> list = new ArrayList<>();
            list.add("sadman");
            list.add("CSE");
            list.add("23-53467-3");
            System.out.println(list);
            list.add("sakib");
            list.remove(2);
            System.out.println(list);

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
