package datastructures;
import java.util.*;

public class hashmap{
    public static void main(String args[]){
        //country (key), population(value)  ;HASHMAP
        HashMap<String ,Integer> map = new HashMap<>();

        //insertion
        map.put("India",120);
        map.put("America",200);
        map.put("china",150);
        map.put("Australia",100);
        System.out.println(map);

        map.put("china",180);
        System.out.println(map);

        if(map.containsKey("china")){
          System.out.println("yes key exist");
        }
          else{
            System.out.println("key is not present");
          }

            System.out.println(map.get("china"));
            System.out.println(map.get("Indonesia")); // null because key not exist

            int arr[] = {10,12,13};

            //loop (1st method)
            for(int i=0; i<3; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
              
           // loop(2nd method)
            for(int val : arr){
                System.out.print(val + " ");
            }
            System.out.println();
            

            //new for loop with the help of entry set
            // for(int value : arr){
                for(Map.Entry<String , Integer> e : map.entrySet()){
                System.out.println(e.getKey());
                System.out.println(e.getValue());

                // keys with keyset
                Set<String> keys = map.keySet();
                for(String key : keys){
                    System.out.println(key + " " + map.get(key));
                }
                 

                //remove function
                map.remove("china");
                System.out.println(map);


            }
          }
        }
    
    

 