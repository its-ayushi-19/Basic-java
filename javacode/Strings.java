import java.util.*;

public class Strings {
    public static void main(String[] args){
        Scanner aa = new Scanner(System.in);
        System.out.print("enter the string:");
        String name = aa.nextLine();
        System.out.println("the string is:" + name);

        //concatenation of strings
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println("the full name is:" + fullName);
        System.out.println(fullName.length());

        //lowercase and uppercase
        System.out.println(fullName.toUpperCase());
        System.out.println(fullName.toLowerCase());

        //chatat function
        System.out.println(fullName.charAt(2));

        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i) + " ");
        }

        //comapre two strings
        String str1 = "hell";
        String str2 = "hello";
        if(str1.compareTo(str2) == 0){                             //s1==s2:0   s1>s2:1   s1<s2:-1
            System.out.println("the strings are equal");
        }
        else if(str1.compareTo(str2) > 0){
            System.out.println("the first string is greater than the second string");
        }
        else{
            System.out.println("the first string is less than the second string");
        }

        //substring
        //last index of substring are exclusive
        String sentence = "My name is Aayushi Agarwal";
        String sub = sentence.substring(11, 18); //last index is also written as sentence.length()
        System.out.println(sub);
        System.out.println(sentence.substring(11)); //if we want to print the substring from a particular index to the end of the string


        //Strings are immutable in java we cant change the value of a string once it is created
        //  but we can create a new string by concatenating the old string with the new string
       
       
       
       
       
       
        aa.close();

    }
    
}
