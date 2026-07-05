public class Factorialrec{
    public static int calculateFact(int n){
        if(n==0||n==1){
            return 1;
        }
        int fact = n*calculateFact(n-1);
        return fact;
    }
    public static void main(String[] args){
        System.out.println(calculateFact(5));
    }
}