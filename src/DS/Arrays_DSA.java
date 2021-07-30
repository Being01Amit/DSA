package DS;

import java.util.*;

public class Arrays_DSA {
    public static void main(String[] args){

        //Majority Number Algorithm
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] number = {2,2,2,2,5,5,2,3,3};
        int maxCount =0;
        Arrays.sort(number);

        for(int i = 0; i< number.length; i++){
            System.out.print(number[i]+" ");
        }

        }
    }

