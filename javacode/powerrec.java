public class powerrec {
    public static int calculatePower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int power =x*calculatePower(x,n-1);
        return power;
    }

    //stack height = n
    public static void main(String[] args){
        int x=2;
        int n=5;
        System.out.println(calculatePower(x,n));        //2^5=32
    }
    
}
