package datastructures;
import java.util.*;

public class LL2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("Hello");
        list.addFirst("Java");
        list.addFirst("LinkedList");
         System.out.println(list);

        list.addLast("Welcome");
        System.out.println(list);

        list.add("aayushi");
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);
         list.remove(2);
         System.out.println(list);

        
         System.out.println(list.size());

         for(int i =0;i<list.size();i++){
            System.out.print(list.get(i)+" -> ");
         }
         System.out.println("NULL");
         }

}
