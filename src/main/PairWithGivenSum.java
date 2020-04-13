package main;

import java.util.HashSet;
import java.util.Set;

public class PairWithGivenSum {

    public int countPairInAnArrayWithGivenSum(int[] arr, int sum){
        int count = 0;
        Set<Integer> hashSet = new HashSet<>();
        for(int i : arr) {
            int temp = sum - i;
            if(hashSet.contains(temp)) {
               count++;
            }
           hashSet.add(i);
        }
        return count;
    }
}
