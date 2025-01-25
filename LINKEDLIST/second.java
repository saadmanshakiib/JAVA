import java.util.*;

public class second {
    public static void main(String[] args) {
        LinkedList<String>l = new LinkedList<>();
        l.add("sadman");
        l.add("sakib");
        l.add("shaj");
        l.add("sadat");
        l.add("Akib");
        l.add("Arif");
        l.add("Avi");
        System.out.println("Initial List : "+l);
        l.removeIf(a->a.charAt(0)=='s');
        System.out.println("After Removing the list names stats with s : "+l);
        LinkedList<Integer>ll = new LinkedList<>();
        ll.add(122);
        ll.add(223);
        ll.add(452);
        ll.add(213);
        ll.add(221);
        ll.add(534);
        ll.add(452);
        System.out.println("Second List : "+ll);
        Iterator<Integer> i = ll.descendingIterator();
        System.out.println("Second List after descending : "+ll);
        while(i.hasNext()){
            System.out.print(" "+i.next());
        }
        System.out.println("\nList 2 contains 332 or not : "+ll.contains(332));
        System.out.println("First Element of list : "+ll.getFirst());
        System.out.println("Last Element of list : "+ll.getLast());
        System.out.println("Get 3rd element from the list using ll.get(3) : "+ll.get(3));
        System.out.println("indexOf(452) : "+ll.indexOf(452));
        System.out.println("Size of the list : "+ll.size());
    }
}
