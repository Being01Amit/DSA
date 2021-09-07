package DS.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        int n = arr.length;
//        reverseArray(arr);
//        ReverseArrays(arr);



    }

    private static void reverseArray(Integer[] a){
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
    }

    public static void ReverseArrays(int[] arr){
        int low = 0;
        int high = arr.length - 1;
        while (arr[low] < arr[high]) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
