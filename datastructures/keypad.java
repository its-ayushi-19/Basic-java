package datastructures;

public class keypad {
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void combination(String str, int idx, String newstr){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char currentchar = str.charAt(idx);
        String mapping = keypad[currentchar-'0'];
        for(int i=0; i<mapping.length(); i++){
            combination(str, idx+1, newstr+mapping.charAt(i));
        }
    }
   // time complexity= O(4^n) because in worst case we have 4 choices for every character.
    public static void main(String[] args){
        String str="23";
        combination(str, 0, "");
    }
    
}
