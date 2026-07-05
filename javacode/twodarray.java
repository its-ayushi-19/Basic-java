import java.util.*;
public class twodarray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows:");
        int m = sc.nextInt();
        System.out.print("enter the number of columns:");
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("enter the elements of the array:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("the elements of the array are:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
