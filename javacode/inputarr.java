import java.util.*;

public class inputarr {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array:");
        int n = sc.nextInt();
         int arr[] = new int[n];

        for(int i=0;i<n;i++){
            System.out.print("enter the element:");
            arr[i] = sc.nextInt();
        }
        System.out.println("the elements of the array are:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

//linear search
        System.out.println("enter the element to be searched:");
        int x= sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){
                System.out.println("the element is found at index:" + i);
                return;
            }
            sc.close();
        }

    } 
    
    
    
}
