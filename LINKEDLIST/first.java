import java.util.*;
public class first {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(45);
        l.add(89);
        l.add(21);
        l.add(11);
        l.add(55);
        l.add(78);
        System.out.println("Linked list initial : "+l);
        l.remove(4);
        System.out.println("Linked list after removing 4th : "+l);
        l.add(4,69);
        System.out.println("Linked list after adding 69 into 4th : "+l);
        l.addFirst(23);
        l.addLast(12);
        System.out.println("Linked list after adding first and last : "+l);
    }
}
