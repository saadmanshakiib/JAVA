import java.util.*;

public class third {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(12);
        l.add(11);
        l.add(23);
        l.add(34);
        l.add(13);
        System.out.println("Linked List : "+l);
        System.out.println("Peek : "+l.peek());
        System.out.println("PeekFirst() : "+l.peekFirst());
        System.out.println("PeekLast() : "+l.peekLast());
        System.out.println("Poll : "+l.poll());
        System.out.println("After Poll Linked List : "+l);
        //poll = pollFirst()
        System.out.println("pollFirst() : "+l.pollFirst());
        System.out.println("After Poll Linked List : "+l);


    }
}
