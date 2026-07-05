package datastructures;

public class subSequence {
    public static void subsequence(String str, int idx, String newstr){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char currentchar = str.charAt(idx);
        //to be added
        subsequence(str, idx+1, newstr+currentchar);
        //not to be added
        subsequence(str, idx+1, newstr);
    }       
    //time complexity= O(2^n) because we have two choices for every character either to be added or not to be added.
    public static void main(String[] args){
        String str ="abcd";  //total subsequences= 2^n= 2^4=16 .
        subsequence(str, 0, ""); 
    }
    
}
