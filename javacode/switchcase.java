import java.util.Scanner;


public class switchcase {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("enter a button:");
                int a = sc.nextInt();
                switch(a){
                    case 1:
                        System.out.println("Hii");
                        case 2:
                            System.out.println("Hello"  );
                            case 3:
                                System.out.println("Welcome");
                                break;
                            
                                default:
                                    System.out.println("Invalid button");
                                    break;
                                    case 4:
                                        System.out.println("Goodbye");
                                    
                    
                }
   sc.close();   
    }
    
}
