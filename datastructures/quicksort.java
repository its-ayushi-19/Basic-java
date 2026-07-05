package datastructures;

public class quicksort {
    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low-1; //index of smaller element
        for(int j=low; j<high; j++){
            if(arr[j]<pivot){
                i++;
                //swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;   //pivot index
    }
    public static void quickSort(int arr[], int low, int high){
        if(low<high){
            int  pivot = partition(arr, low , high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);

        }
    }

    //time complexity = O(n log n) in best and average case, O(n^2) in worst case (when the array is already sorted or reverse sorted)
    
    public static void main(String[] args){
        int arr[] = {6,3,9,5,2,8};
        int n= arr.length;
        quickSort(arr, 0, n-1);
        //print sorted array
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
