package datastructures;

//find the number of ways in which you can invite n people to a party, single or in pairs ?

public class recursion {
    public static int callGuest(int n){
        if(n<=1){
            return 1;
        }
        //single
        int single = callGuest(n-1);

        //pair
        int pair = (n-1)*callGuest(n-2);
        return single + pair;
    }
    public static void main(String[] args){
        int n = 4;
        System.out.println(callGuest(n));
    
}
}
