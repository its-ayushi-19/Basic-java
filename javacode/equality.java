import java.util.Scanner;

public class equality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number:");
        int a = sc.nextInt();
        System.out.println("enter 2nd number:");
        int b = sc.nextInt();
        if(a==b){
            System.out.println("a and b are equal");

        }
       else if(a>b){
            System.out.println("a is greater than b ");
        }
        else
        {
            System.out.println("b is greater than a ");
        }
        sc.close();
    
    }
    
}
