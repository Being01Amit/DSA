package Algo.Sorting;

import java.util.*;

public class Bubble_Sort {
    public static void main(String[] args){

        int[] arr = {3,2,6,5,1,7,8,9,4,0};

        int n = arr.length;

        Arrays.sort(arr);
        for(int i: arr){
            System.out.println(arr[i]);
        }

        for (int i = 0; i < n -1; i++){
            for(int j = 0; j< n- i -1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}



