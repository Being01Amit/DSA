package Algo.Sorting.Sorting;

public class Insertion_Sort {
    public static void main(String[] args){

        int[] arr = {3,2,6,5,1,7,8,9,4,0};

        for(int i =1; i< arr.length; i++){
            int temp = arr[i];
            int j = i-1;

            while( j>= 0 && arr[j] > temp){
                    arr[j+1] = arr[j];
                    j--;
            }
            arr[j+1] = temp;
        }

        System.out.println("Array in ascending order :");

        for(int i : arr){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        System.out.println("Array in descending order :");

        for(int i = arr.length -1; i>=0 ; i--){
            System.out.print(arr[i]+" ");
        }
    }
}
