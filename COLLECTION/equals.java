import java.util.*;

public class equals {
    public static void main(String[] args) {
        AbstractList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("List = "+list);
        list.add(3,60);
        System.out.println("Inserting at index 3 : "+list);
        list.remove(1);
        System.out.println("Removing 2nd element : "+list);
        list.removeFirst();
        System.out.println("Removing first element : "+list);
        list.removeLast();
        System.out.println("Removing last element  : "+list);

        AbstractList<Integer> list2 = new ArrayList<Integer>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        System.out.println("List2 = "+list2);
        System.out.println("List and List2 are equivalent or not  = "+list.equals(list2));






    }

}
