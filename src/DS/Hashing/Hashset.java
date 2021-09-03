package DS.Hashing;
import java.util.Set;
import java.util.HashSet;


public class Hashset {
    public static void main(String[] args){
        int[] a = {3,2,6,5,1};
        int[] b = {7,8,9,4,0};
//       int result =  CountDistinct(arr);
        int result = Union(a,b);
        System.out.println(result);

    }
/* Count Distinct Problem of Hashing Solving using HashSet  */
//    public static int CountDistinct (int[] a){
//        Set<Integer> set = new HashSet<>();
//        for (int element : arr){
//            set.add(element);
//        }
//        return set.size();
//    }

    /* Find the Union of the Two Arrays Using the HashSet */

    public static int Union (int[] a , int[] b){
        Set<Integer> set = new HashSet<>();

        for (int x : a){
            set.add(x);
        }

        for (int x : b){
            set.add(x);
        }

        return set.size();
    }
}
