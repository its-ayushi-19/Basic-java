package datastructures;

import java.util.ArrayList;
import java.util.Collections;


  public class arrylist {

    public static void main(String[] args){
     ArrayList <Integer> list = new ArrayList <Integer>();


     //add elements
     list.add(0);
     list.add(2);
     list.add(3);
     System.out.println(list);  //print the list

     //get elements
     int elements = list.get(1);
     System.out.println(elements);  //print the element at index 1

     //add element in between
     list.add(1,1);  //add element 1 at index 1
     System.out.println(list);  //print the list

     //set elements
     list.set(0,5);  //set element at index 0 to 5
     System.out.println(list);  //print the list

     //remove element
     list.remove(2);  //remove element at index 2
     System.out.println(list);  //print the list

     //size of the list
     int size = list.size();
      System.out.println(size);  //print the size of the list

      //loops
      for(int i=0; i<list.size(); i++){
        System.out.print(list.get(i) + " ");  //print elements using for loop
      }

      //sorting the list
      Collections.sort(list);  //sort the list in natural order
      System.out.println("\n" + list);  //print the sorted list



    }


    
}
