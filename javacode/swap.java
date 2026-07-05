
import java .util.Scanner;

public class swap {
    public static void main(String[] args){
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        a=sc.nextInt();
        System.out.println("enter the value of b");
        b=sc.nextInt();
        //System.out.println("before swapping a is "+a+" and b is "+b);
       /*  a=a-b;
           b=a+b;
             a=b-a;*/
        a=a^b;
        b=a^b;  
        a=a^b;
        System.out.println("after swapping a is "+a+" and b is "+b);
        sc.close();
    }
    
}
