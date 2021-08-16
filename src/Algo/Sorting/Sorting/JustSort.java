package Algo.Sorting.Sorting;
import java.util.*;

public class JustSort {
    public static void main(String[] args){
        int[] arr = {3,2,6,5,1,7,8,9,4,0};

        //This sorting function is from import from the ulit package and this function is using best sorting technique for sort the array
        Arrays.sort(arr);

        for (int i : arr){
            System.out.print(arr[i]+" ");
        }


    }
}
