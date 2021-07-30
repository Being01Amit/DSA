package Algo.Sorting;
import java.util.*;

public class Selection_Sort {
    public static void main(String[] args){
        int arr[] = {3,2,6,5,1,7,8,9,4,0};

//        Arrays.sort(arr);

        for(int i =0; i < args.length -1; i++){
            int min = i;
            for(int j = i+1;j < arr.length; j++){

                if (arr[j] < arr[min]) min = j;

                if ( min != i ){
                    int temp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = temp;
                }

            }
        }
        for(int i : arr) {
            System.out.print(arr[i] + " ");
        }

    }
}
