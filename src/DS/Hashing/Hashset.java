package DS.Hashing;
import java.util.Set;
import java.util.HashSet;


public class Hashset {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int[] b = {1,2,3};
//       int result =  CountDistinct(arr);
//        int result = Union(a,b);
        int result = Intersection(a,b);
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
//    public static int Union (int[] a , int[] b){
//        Set<Integer> set = new HashSet<>();
//
//        for (int x : a){
//            set.add(x);
//        }
//
//        for (int x : b){
//            set.add(x);
//        }
//
//        return set.size();
//    }

    /* Finding the Intersection of two arrays using the HashSet */
    public static int Intersection(int[] a, int[] b){
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for (int x : a){
            set.add(x);
        }

        for (int x : b){
            if(set.contains(x)){
                count++;
                set.remove(x);
            }
        }
        return count;
    }
}
