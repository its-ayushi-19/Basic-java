import java.util.*;

public class fibnocci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print("the fibnocci series is: " + a + " " + b + " ");
        for(int i=2;i<n;i++){
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        sc.close();
    }
    
}
