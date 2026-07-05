package datastructures;
import java.util.ArrayList;

//print all the subsets of a set of first n natural numbers.

public class recursion1 {
    public static void printSubsets(ArrayList<Integer> subset) {
        for(int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findSubsets(int n, ArrayList<Integer> subset){
        if(n==0){
            printSubsets(subset);
            return;
        }     
        //include n in the subset
        subset.add(n);
        findSubsets(n-1, subset);

        //exclude n from the subset
        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);
    }
    
    //time complexity = O(2^n)
    public static void main(String[] args){
        int n = 3;
         ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset);
}
}
 