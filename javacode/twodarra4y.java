import java.util.*;
public class twodarra4y {
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

        //search an element in the array
        System.out.print("enter the element to be searched:");
        int x= sc.nextInt();{
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(arr[i][j] == x){
                        System.out.println("element found at index: " + i + "," + j);
                    }
                 }
            }
        }




        sc.close();
    }
    
}
