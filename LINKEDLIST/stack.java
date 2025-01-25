import java.util.LinkedList;

public class stack {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(11);
        stack.push(10);
        stack.push(9);
        stack.push(14);
        System.out.println("Stack : "+stack);
        System.out.println("Last Element : "+stack.peekLast());
    }
}
