package Algo.Searching;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {3,2,6,5,1,7,8,9,4,0};

        // Sorting the Array for Binary Search
        Arrays.sort(arr);
        int result = binarySearch(arr,55);

        if (result == -1){
            System.out.println("Element is not present in an Array");
        }else {
            System.out.println("Element is Present in an Array : "+ result);
        }
    }

    /* Iterative implementation of Binary Search  */
    public static int binarySearch(int[] arr, int key){
        //Lowest index of an Array
        int low = 0;

        //Highest index of an Array
        int high = arr.length-1;

        //This condition false when the element is not present in the array, Because the that time the Low element is greater than higher element then we return -1
        while (low <= high){

            //Middle of an Aray
            int mid = (low+high)/2;

            // Check the condition if we find the element in the middle so return middle as key.
            if(mid == key){
                return mid;
            }

            //if key is not equal to the middle element so element(key) is greater than middle element. SO now lower element is mid +1
            else if (key > arr[mid]){
                low = mid +1;
            }

            //if key is not equal to the middle element so element(key) is lesser than middle element. SO now higher element is mid -1
            else{
                high = mid -1;
            }

        }

        // if is not present in the array so simply return -1
        return -1;
    }
}
