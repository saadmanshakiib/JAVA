import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class list{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(34);
        list1.add(67);
        list1.add(21);
        list1.add(99);
        list1.add(31);
        System.out.println("Array list : "+list1);
        list1.add(4,77);
        list1.add(2,13);
        list1.add(5,98);
        System.out.println("Array list after adding values : "+list1);
        list1.remove(3);
        System.out.println("Array list after removing values : "+list1);
        //list1.clear() = all vanished
        //list1.clear();
       System.out.println("Array empty or not : "+list1.isEmpty());  
        System.out.println("Array has the value 30 or not : "+list1.contains(30));  
        System.out.println("Array has the value 21 or not : "+list1.contains(99));
                System.out.println("Index of 31 : "+list1.indexOf(31));  
                System.out.println("Set 45 at index no 3 ");
                //set = replace
                list1.set(3,45);
            System.out.println("Array list : "+list1);
            //sorting
            Collections.sort(list1);
            System.out.println("Sorted list : "+list1);
            ArrayList<Integer> list2 = new ArrayList<>();
            list2.addAll(list1);
            System.out.println(list2);
            Collections.sort(list2);
                        System.out.println(list2);

          
        
  


    }
}