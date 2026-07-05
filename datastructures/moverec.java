package datastructures;

public class moverec {
    public static void moveAllx(String str, int idx ,int count, String newstr){
        if(idx==str.length())  {
            for(int i=0; i<count; i++){
                newstr+='x';
            }
            System.out.println(newstr);
            return;
        }
        char currentchar = str.charAt(idx);
        if(currentchar=='x'){
            count++;
            moveAllx(str, idx+1, count, newstr);
        }
        else{
            newstr+=currentchar;
            moveAllx(str, idx+1, count, newstr);
        }           
    }
    //time complexity= O(n+count)=O(n)
    public static void main(String[] args){
        String str="axbcxxde";
        moveAllx(str, 0, 0, "");
    }
    
}
