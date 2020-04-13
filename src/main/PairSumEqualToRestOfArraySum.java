package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PairSumEqualToRestOfArraySum {

    public void pairSumArraySum(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        int finalSum = sum/2;
        Set<Integer> hashSet = new HashSet<>();
        for(int i=0;i<arr.length;i++) {
            int temp = finalSum - arr[i];
            if(hashSet.contains(temp)) {
                System.out.println("The Pairs are "+arr[i]+" "+temp);
            }
            hashSet.add(arr[i]);
        }
    }
}
