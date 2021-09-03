package DS.Hashing;
import java.util.Set;
import java.util.HashSet;


public class Hashset {
    public static void main(String[] srgs){
        int[] arr = {3,2,6,5,1,7,8,9,4,0};
       int result =  CountDistinct(arr);
        System.out.println(result);

    }
/* Count Distinct Problem of Hashing Solving using HashSet  */
    public static int CountDistinct (int[] arr){
        Set<Integer> set = new HashSet<>();
        for (int element : arr){
            set.add(element);
        }
        return set.size();
    }
}
