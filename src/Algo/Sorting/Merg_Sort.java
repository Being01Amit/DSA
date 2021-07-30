package Algo.Sorting;

public class Merg_Sort {
    public static void main(String[] args){
        int arr[] = {3,2,6,5,1,7,8,9,4,0};
        int n = arr.length;
        mergSort(arr,0,n-1);
        printArray(arr,n);

    }

    // In this function we're using divide and conquer technique to sort an array
    public static void mergSort(int[] arr,int l,int r){
        if (l < r){

            /* In this line of code we find the mid of the array, so we break the array into sub=array and sort */
            int midIndex = (l+r)/2;
            //array of left to middle
            mergSort(arr,l,midIndex);

            // array from the mid+1 to Right
            mergSort(arr,(midIndex+1),r);

            /* Internal function that sort the array internally */
            merg(arr,l,midIndex,r);
        }
    }
 // this is the function that performing the merg and sort the array
    public static void merg(int[] arr, int l , int midIndex, int r){

        /* creating the new array to store the smaller value into it */
        int[] b = new int[20];
        int i = l;
        int j = (midIndex+1);
        int k = l;

        while (i<= midIndex && j<= r){

            if (arr[i] < arr[j]){
                b[k] = arr[i];
                i++;
            }else {
                b[k] = arr[j];
                j++;
            } k++;
        }

        if (i > midIndex){
            while(j <= r){
                b[k] = arr[j];
                k++; j++;
            }
        } else {
            while(i <= midIndex){
                b[k] = arr[i];
                k++; i++;
            }
        }
        for (k = l; k <= r;k++){
            arr[k] = b[k];
        }

    }

    public static void printArray(int[] arr,int n){
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
