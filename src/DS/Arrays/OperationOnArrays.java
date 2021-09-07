package DS.Arrays;

public class OperationOnArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int result = findElement(arr,5);
        System.out.println(result);
    }

    public static int findElement(int[] arr, int x){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]== x){
                return i ;
            }

        }

        return  -1;
    }
}
