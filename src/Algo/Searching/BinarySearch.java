package Algo.Searching;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {3,2,6,5,1,7,8,9,4,0};
        int low = 0;
        int high = arr.length-1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Element to Search in Array : ");
        int key = sc.nextInt();

        // Sorting the Array for Binary Search
        Arrays.sort(arr);
//       int result = binarySearchIterative (arr,key);

       int result = BinarySearchReccursive(arr,key,low,high);

        if (result == -1){
            System.out.println("Element is not present in an Array");
        }else {
            System.out.println("Element is Present in an Array at Index : "+ arr[key -1] );
        }
    }

    /* Iterative implementation of Binary Search  */
    public static int binarySearchIterative (int[] arr, int key){
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

    /* Recursive implementation of Binary Search  */
    public static int BinarySearchReccursive(int[] arr, int key, int low , int high ){

        if(low > high) return -1;

        int mid = (low + high)/2;

        if(arr[mid] == key) return mid;

        if (key > arr[mid]) return BinarySearchReccursive(arr, key, mid + 1, high);


            return BinarySearchReccursive(arr, key, low, mid - 1);

    }
}
