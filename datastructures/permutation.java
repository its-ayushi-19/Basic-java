package datastructures;

public class permutation {
    public static void printPer(String str, String perm){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length(); i++){
            char currentchar = str.charAt(i);
            String newstr = str.substring(0,i)+str.substring(i+1);
            printPer(newstr, perm+currentchar);

        }
    }
    //time complexity= O(n*n!) because we have n choices for first character, n-1 choices for second character and so on. and for every permutation we are creating a new string which takes O(n) time.
    
        public static void main(String[] args){
            String str = "abc";
            printPer(str, "");
        }
    }
    

