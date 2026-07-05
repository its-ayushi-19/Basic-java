
import java.util.*;

public class input {
    public static void main(String[] args) {
        //input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Hello " + name);

        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Your age is " + age);
        sc.close();
    }
    
}

//next function is used to take input from user in string format but it will only take the first word 
// of the input. If you want to take the whole line as input then you can use nextLine() function.
