import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            int mul =n*i;
            System.out.println(n +" * "+ i + "  = " + mul);
            
    
        }
        sc.close();
    }       
    
}
