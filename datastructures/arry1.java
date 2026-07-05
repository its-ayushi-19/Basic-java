package datastructures;

//check if an array is sorted or strictly increasing with recursion
public class arry1 {
    public static boolean isSorted(int arr[], int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx] >= arr[idx+1]){
            return false;
        }
        return isSorted(arr, idx+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,5};      //false not strictly increasing
        System.out.println(isSorted(arr, 0));
    }
    
}
