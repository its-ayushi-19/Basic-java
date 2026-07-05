import java.util.Scanner;

public class calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number:");
        int a = sc.nextInt();
        System.out.println("enter 2nd number:");
        int b = sc.nextInt();
        System.out.println("enter operator:");
        char c = sc.next().charAt(0);
        switch(c){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                if(b!=0){
                    System.out.println(a/b);
                }
                else{
                    System.out.println("cannot divide by zero");
                }
                break;
            default:
                System.out.println("invalid operator");
                break;
        }
        sc.close();
    }
    
}
