public class fibnoccirec {
    public static void printFib(int a, int b, int n){
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.print(c+" ");
        printFib(b,c,n-1);
    }
    public static void main(String[] args){
        int n = 10;
        int a=0, b=1;
        System.out.print(a+" "+b+" ");
        printFib(0,1,n-2);
    }

}