package Algo.Sorting;

public class Quick_Sort {
    public static void main(String[] args){
        int arr[] = {3,2,6,5,1,7,8,9,4,0};
        int n = arr.length;

        quickSort(arr,0, n - 1);
        System.out.println("Sorted array");
        printArray(arr,n);
    }

    public static void printArray(int[] arr, int n){

        for (int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
// IN the partition Function we divide the function into two part and in middle fo the two array is the sorted pivort element
    public static int partition(int[] arr,int l, int h){
        int pivot = arr[l];

        int i = l;
        int j = h;

        while(i < j) {
            // this loop is working if the element is smaller than the pivort function so move forward otherwise hold that position
            while (arr[i] <= pivot) i++;

            // this loop is working if the element is Bigger than the pivort function so  move forward otherwise hold that position
            while (pivot <= arr[j]) j--;

            //this functio check if the j is crossing j position so the so swap the pivot with i position
            if (i < j) {
                swap(arr,i,j);
            }

        }
        swap(arr,j,l);
        return j;
    }

    // This is the Simple Swap function
     public static void swap (int arr[], int i , int j ){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }


    //This the quick Sort function is divide the array into two separate part
    public static void quickSort(int[] arr ,int l , int h){

        // This quick Sort function is Recursive function;
        if(l < h){
            int pivot = partition(arr,l,h);
            // This part is calling the Quick Sort function and sorting the element which is smaller than Pivort
            quickSort(arr,l,pivot-1);

            // This part is calling the Quick Sort function and sorting the element which is Greater than Pivort
            quickSort(arr,pivot+1,h);
        }
    }
}
