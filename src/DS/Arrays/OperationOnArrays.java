package DS.Arrays;

public class OperationOnArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int n = arr.length;
//        int result = findElement(arr,5);
//        System.out.println(result);
//        RightRotateArray(arr,n);
        LeftRotateArray(arr,n);
    }

    public static int findElement(int[] arr, int x){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]== x){
                return i ;
            }

        }

        return  -1;
    }

    public static void RightRotateArray(int[] arr, int n){
        int temp = arr[n-1];
        for (int i = n-1; i> 0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;

        for (int i =0;i < n ;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void LeftRotateArray(int[] arr, int n){
        int temp = arr[0];
        for(int i = 1; i < n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;

        for (int i =0;i < n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
