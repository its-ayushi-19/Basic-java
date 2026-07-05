package datastructures;
import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String args[]){
        //creating 
        HashSet<Integer> set = new HashSet<>();
    
        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1); 
        set.add(10);
        set.add(58);  // set cannot contains duplicates

        //set contains ?
        if(set.contains(3)){
           System.out.println("set contains this element");
        }
        if(!set.contains(4)){
            System.out.println("set dosen't contain this element");
        }

        //delete operation
        set.remove(3);
        if(!set.contains(3)){
            System.out.println("set dosent contain 3");
        }

        //size of set
        System.out.println("size of set is " + set.size());

        //print all elements in set
        System.out.println(set);

        //iterator
        Iterator <Integer> it = set.iterator();

       while(it.hasNext()){
        System.out.println(it.next());
       }

    }
    
}
