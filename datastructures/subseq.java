package datastructures;
import java.util.HashSet;
 
//print all the unique subsequences of a string using recursion
public class subseq {
    public static void subsequence(String str, int idx, String newstr, HashSet<String> set){
        if(idx==str.length()){
            if(set.contains(newstr)){
                return;
            }
            else{
                System.out.println(newstr);
                set.add(newstr);
            }
            return;
        }
        char currentchar = str.charAt(idx);
        //to be added
        subsequence(str, idx+1, newstr+currentchar, set);
        //not to be added
        subsequence(str, idx+1, newstr, set);
    }       
    public static void main(String[] args){
        String str ="aaa";  //total subsequences= 2^n= 2^4=16 .
        HashSet<String> set = new HashSet<>();
        subsequence(str, 0, "", set);
    }
    
}
