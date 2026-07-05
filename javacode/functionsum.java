import java.util.*;

public class functionsum {
    public static int sum(int a, int b){
        int sum = a + b;
        return sum;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number:");
        int a = sc.nextInt();
        System.out.print("enter second number:");
        int b = sc.nextInt();
        int sum = sum(a,b);
        System.out.println("the sum is: " + sum);
        sc.close();
}
}
