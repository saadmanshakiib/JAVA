import java.util.*;
public class LD{
    public static void main(String[] a){
        LinkedList<String> l = new LinkedList<String>();
        l.add("CSE");
        l.add("EEE");
        l.add("ARCH");
        l.add("CE");
        l.add("EECE");
        System.out.println("Basic List : "+l);
        l.remove(3);
        System.out.println("After Removing 3rd index : "+l);//ce
        l.add(3,"ME");
        System.out.println("After adding 3rd index : "+l);//me
        System.out.println("First element : "+l.getFirst());
        System.out.println("Last element : "+l.getLast());
        l.addFirst("COE");
        System.out.println("Adding First Element : "+l);
        l.addLast("IPE");
        System.out.println("Adding last Element : "+l);
        System.out.println("Removing first element : "+l.removeFirst());
        System.out.println("Removing last element : "+l.removeLast());
    }
}