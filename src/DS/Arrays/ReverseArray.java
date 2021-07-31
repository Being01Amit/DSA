package DS.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray{
    public static void main(String[] args){
        Integer[] a = {1,2,3,4,5,6,7,8,9,0};
        reverseArray(a);
    }

    private static void reverseArray(Integer[] a){
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
    }
}
